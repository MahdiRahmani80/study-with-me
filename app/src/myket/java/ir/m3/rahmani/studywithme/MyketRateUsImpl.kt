package ir.m3.rahmani.studywithme

import android.content.Intent
import android.net.Uri
import ir.m3.rahmani.studywithme.utils.RateUs


class MyketRateUsImpl : RateUs {
    override fun rateUs(): Intent {
        val url = "myket://comment?id=$App_ID"
        val intent = Intent()
        intent.setAction(Intent.ACTION_VIEW)
        intent.setData(Uri.parse(url))

        return intent
    }

    companion object {
        const val App_ID = "com.m3.rahmani.studywithme"
    }
}