package ir.m3.rahmani.studywithme.login.onboarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.ActivityOnboardingBinding
import ir.m3.rahmani.studywithme.di.Injector
import ir.m3.rahmani.studywithme.login.onboarding.pages.OnboardingFragment
import ir.m3.rahmani.studywithme.login.onboarding.pages.OnboardingPagerData

/**
 * todo: fix bug
 * when user want to change theme light to dark ot dark to light
 * app crashing
 * It might be related to making fragment with constructor parameters when activity is
 * created and remaking fragment (pager)
 */
class OnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.inject(this)
        super.onCreate(savedInstanceState)

        binding = ActivityOnboardingBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val pagerAdapter = ScreenSlidePagerAdapter(this)
        binding.pager.adapter = pagerAdapter
    }

    private inner class ScreenSlidePagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
        override fun getItemCount() = SCREEN_NUMBERS

        override fun createFragment(position: Int): Fragment {
            val pos = position + 1
            return OnboardingFragment(getPagerData(pos))
        }

    }

    private fun getPagerData(item: Int) = when (item) {
        1 -> OnboardingPagerData(item, R.drawable.book, getString(R.string.onboarding_text_1))
        2 -> OnboardingPagerData(item, R.drawable.book2, getString(R.string.onboarding_text_2))
        3 -> OnboardingPagerData(item, R.drawable.book3, getString(R.string.onboarding_text_3))

        else -> OnboardingPagerData(item, R.drawable.book, "fragment 1")
    }

    companion object {
        const val SCREEN_NUMBERS = 3

    }
}

