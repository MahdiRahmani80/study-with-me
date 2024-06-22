package ir.m3.rahmani.studywithme

import android.content.Intent
import android.net.Uri
import ir.m3.rahmani.studywithme.utils.RateUs

class BazaarRateUsImpl:RateUs {
    override fun rateUs(): Intent {
        val url ="bazaar://details?id=$App_ID"
        val intent = Intent()
        intent.setAction(Intent.ACTION_VIEW)
        intent.setData(Uri.parse(url))
        return intent
    }

    companion object {
        const val App_ID = "com.m3.rahmani.studywithme"
    }
}