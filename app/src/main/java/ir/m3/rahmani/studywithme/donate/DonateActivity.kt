package ir.m3.rahmani.studywithme.donate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.ActivityDonateBinding
import ir.m3.rahmani.studywithme.di.Injector
import ir.m3.rahmani.studywithme.payment.MyPurchaseInfo
import ir.m3.rahmani.studywithme.payment.PurchaseHelper

class DonateActivity : AppCompatActivity(), PurchaseHelper.PurchaseListener {

    lateinit var binding: ActivityDonateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityDonateBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        initPayment()
        binding.support1.setOnClickListener { startPurchase(DONATE_1000) }
        binding.support5.setOnClickListener { startPurchase(DONATE_5000) }
        binding.support20.setOnClickListener { startPurchase(DONATE_20000) }
        binding.support100.setOnClickListener { startPurchase(DONATE_100000) }

    }


    // Payment ==========================================

    companion object {
        const val DONATE_1000 = "donate_1000"
        const val DONATE_5000 = "donate_5000"
        const val DONATE_20000 = "donate_20"
        const val DONATE_100000 = "donate_100"
    }

    private val purchaseHelper: PurchaseHelper by lazy {
        PurchaseHelper(this)
    }

    fun initPayment() {
        purchaseHelper.startIAP(this)
    }

    fun startPurchase(sku: String) {
        purchaseHelper.launchPurchaseFlow(sku, activityResultRegistry)
    }

    override fun onDestroy() {
        super.onDestroy()
        purchaseHelper.stopService()

    }

    override fun onConsumeFinished(purchase: MyPurchaseInfo) {
        val bar = Snackbar.make(
            this,
            binding.root,
            getString(R.string.payment_success),
            Snackbar.LENGTH_SHORT
        )
        bar.view.layoutDirection = View.LAYOUT_DIRECTION_RTL
        bar.show()
    }

    override fun onErrorInPayment(error: String) {
        val bar = Snackbar.make(
            this,
            binding.root,
            getString(R.string.payment_fail),
            Snackbar.LENGTH_SHORT
        )
        bar.view.layoutDirection = View.LAYOUT_DIRECTION_RTL
        bar.show()
    }
}