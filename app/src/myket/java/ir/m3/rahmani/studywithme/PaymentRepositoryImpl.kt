package ir.m3.rahmani.studywithme

import android.app.Activity
import androidx.activity.result.ActivityResultRegistry
import ir.m3.rahmani.studywithme.payment.MyPurchaseInfo
import ir.m3.rahmani.studywithme.payment.PaymentRepository
import ir.myket.billingclient.IabHelper.ITEM_TYPE_INAPP
import ir.myket.billingclient.util.Purchase
import ir.myket.billingclient.IabHelper
import ir.myket.billingclient.IabHelper.ITEM_TYPE_SUBS
import java.lang.ref.WeakReference

class PaymentRepositoryImpl(activity: Activity) : PaymentRepository {
    private var weakActivity = WeakReference(activity)
    private var mHelper: IabHelper? = null
    override fun initService(result: (Result<String>) -> Unit) {
        mHelper = IabHelper(weakActivity.get()?.baseContext, MYKET_PUBLIC_KEY)
        try {
            mHelper?.startSetup { status ->
                when {
                    status.isSuccess -> {
                        result.invoke(Result.success(""))
                    }

                    status.isFailure -> {
                        result.invoke(Result.failure(Throwable(status.message)))
                    }
                }


            }
        } catch (ex: Exception) {
            result.invoke(Result.failure(Throwable("Initialization failed")))
        }
    }

    override fun stopConnection() {
        mHelper?.dispose()
    }

    override fun launchPurchase(
        SKU: String,
        payload: String,
        activityResultRegistry: ActivityResultRegistry,
        result: (Result<MyPurchaseInfo>) -> Unit
    ) {

        /*if (mHelper?.asyncInProgress == true)
            return*/

        mHelper?.launchPurchaseFlow(
            weakActivity.get(),
            SKU,
            { status, purchase ->
                when {
                    status.isFailure -> {
                        result.invoke(Result.failure(Throwable("Purchase failed")))
                    }

                    status.isSuccess -> {
//                        result.invoke(Result.success(purchase.convertToMyPurchase()))   // None consumable
                        purchase?.let {
                            val myPurchase = it.convertToMyPurchase()
                            consumePurchaseInFirstPlace(myPurchase, result)
                        } ?: run {
                            result.invoke(Result.failure(Throwable("purchase is null")))
                        }
                    }
                }
            },
            payload
        ) ?: kotlin.run {
            callPurchaseFail(result)
        }

    }

    private fun consumePurchaseInFirstPlace(
        myPurchase: MyPurchaseInfo,
        result: (Result<MyPurchaseInfo>) -> Unit
    ) {
        consumePurchase(myPurchase) { consumeResult ->
            if (consumeResult.isSuccess) {
                result.invoke(Result.success(myPurchase))
            } else {
                result.invoke(
                    Result.failure(
                        consumeResult.exceptionOrNull()
                            ?: Exception("Consumption failed")
                    )
                )
            }
        }
    }

    override fun getPurchasedList(result: (Result<List<MyPurchaseInfo>>) -> Unit) {
        try {
            mHelper?.queryInventoryAsync { queryResult, inventory ->
                when {
                    queryResult.isSuccess -> {
                        val purchaseList = arrayListOf<MyPurchaseInfo>()

                        result.invoke(Result.success(purchaseList))
                    }

                    queryResult.isFailure -> {
                        result.invoke(Result.failure(Throwable(queryResult.message)))
                    }
                }
            } ?: kotlin.run {
                callPurchaseFail(result)
            }
        } catch (e: Exception) {
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
        mHelper?.consumeAsync(
            purchaseInfo.convertToPurchase()
        ) { purchase, status ->
            when {
                status.isSuccess -> {
                    result.invoke(Result.success(purchase.convertToMyPurchase()))
                }

                status.isFailure -> {
                    result.invoke(
                        Result.failure(
                            Throwable()
                        )
                    )
                }
            }

        } ?: kotlin.run {
            callPurchaseFail(result)
        }
    }


    companion object {
        const val MYKET_PUBLIC_KEY =
            "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDLR2iR2H3vXoPYdQyfc+843oznKBVTHMjTLqq5ZFV3+jCd0/K4MdY45OV6NC5eGE1p/drWLscia2u42oJhkCX6hS2+KUXxJBjdd/oPFYfSXxENha0ZbyscIL7dsOPysgY8kfWFf3cj3kI/oPHFDpwqwudmiEIXf4wwX/p9yL6mPQIDAQAB"
    }
}

fun Purchase.convertToMyPurchase(): MyPurchaseInfo {
    return MyPurchaseInfo(
        orderId = orderId,
        purchaseToken = token,
        payload = developerPayload,
        packageName = packageName,
        purchaseTime = purchaseTime,
        productId = sku,
        originalJson = originalJson,
        dataSignature = signature
    )
}

fun MyPurchaseInfo.convertToPurchase(): Purchase {
    return Purchase(
        ITEM_TYPE_INAPP,
        originalJson,
        dataSignature
    )
}