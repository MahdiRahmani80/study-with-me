package ir.m3.rahmani.studywithme

import android.app.Activity
import androidx.activity.result.ActivityResultRegistry
import ir.cafebazaar.poolakey.Connection
import ir.cafebazaar.poolakey.Payment
import ir.cafebazaar.poolakey.config.PaymentConfiguration
import ir.cafebazaar.poolakey.config.SecurityCheck
import ir.cafebazaar.poolakey.entity.PurchaseInfo
import ir.cafebazaar.poolakey.request.PurchaseRequest
import ir.m3.rahmani.studywithme.payment.MyPurchaseInfo
import ir.m3.rahmani.studywithme.payment.PaymentRepository
import java.lang.ref.WeakReference

class PaymentRepositoryImpl(activity: Activity) : PaymentRepository {

    private var paymentConnection: Connection? = null
    private var payment: Payment? = null
    private var weakActivity = WeakReference(activity)

    override fun initService(result: (Result<String>) -> Unit) {
        val localSecurityCheck = SecurityCheck.Enable(
            rsaPublicKey = TOKEN
        )


        val paymentConfiguration = PaymentConfiguration(
            localSecurityCheck = localSecurityCheck
        )

        payment = Payment(
            context = weakActivity.get()?.applicationContext!!,
            config = paymentConfiguration
        )
        startConnection(result)
    }

    private fun startConnection(result: (Result<String>) -> Unit) {
        paymentConnection = payment?.connect {
            connectionSucceed {
                result.invoke(Result.success(""))
            }
            connectionFailed { throwable ->
                result.invoke(Result.failure(throwable))
            }
            disconnected {

            }
        }
    }

    override fun stopConnection() {
        paymentConnection?.disconnect()
    }

    override fun launchPurchase(
        SKU: String,
        payload: String,
        activityResultRegistry: ActivityResultRegistry,
        result: (Result<MyPurchaseInfo>) -> Unit
    ) {
        val purchaseRequest = PurchaseRequest(
            productId = SKU,
            payload = payload
        )

        payment?.purchaseProduct(
            registry = activityResultRegistry, request = purchaseRequest
        ) {
            purchaseFlowBegan {

            }
            failedToBeginFlow { throwable ->
                result(Result.failure(throwable))
            }
            purchaseSucceed { purchaseEntity ->
                result(Result.success(purchaseEntity.convertToMyPurchaseInfo()))
            }
            purchaseCanceled {
                result.invoke(
                    Result.failure(
                        Throwable()
                    )
                )
            }
            purchaseFailed { throwable ->
                result(Result.failure(throwable))
            }
        } ?: kotlin.run {
            callPurchaseFail(result)
        }
    }

    override fun getPurchasedList(result: (Result<List<MyPurchaseInfo>>) -> Unit) {
        payment?.getPurchasedProducts {
            querySucceed { purchasedProducts ->
                result.invoke(Result.success(purchasedProducts.map { it.convertToMyPurchaseInfo() }))
            }
            queryFailed { throwable ->
                result.invoke(Result.failure(throwable))
            }
        } ?: kotlin.run {
            callPurchaseFail(result)
        }
    }

    private fun <T> callPurchaseFail(result: (Result<T>) -> Unit) {
        result.invoke(Result.failure(Throwable("purchase is failed")))
    }

    override fun consumePurchase(
        purchaseInfo: MyPurchaseInfo,
        result: (Result<MyPurchaseInfo>) -> Unit
    ) {
        payment?.consumeProduct(purchaseInfo.purchaseToken) {
            consumeSucceed {
                result(Result.success(purchaseInfo))
            }
            consumeFailed { throwable ->
                result(Result.failure(throwable))
            }
        } ?: kotlin.run {
            callPurchaseFail(result)
        }
    }

    companion object{
        private const val TOKEN = "MIHNMA0GCSqGSIb3DQEBAQUAA4G7ADCBtwKBrwC2Szbzx6lmo3HRHYvc4o1iKljyW6vQ64MiBR4bk+ZS+BO9cuVZpLQXO4SIBSahnXd3h1Bf25FAbrG9ly5I9VIzYlQYhaKt/0yDbc8a8b5svxM3lgLboRBhsB0f5HGa5/+R+nJazFMYIm+qIQWzc4701+q60qvC1xe2g5/3++w4c7ceQejCNlWeKTqWV5Uaha1ZZaqVg6sKl+KlmvTAB9Kai5H8yr6a20Dxpa8BjEUCAwEAAQ=="
    }
}

fun PurchaseInfo.convertToMyPurchaseInfo(): MyPurchaseInfo {
    return MyPurchaseInfo(
        orderId,
        purchaseToken,
        payload,
        packageName,
        purchaseTime,
        productId,
        originalJson,
        dataSignature
    )
}