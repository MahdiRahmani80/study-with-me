package ir.m3.rahmani.studywithme.main

import android.content.Intent
import android.os.Bundle
import android.view.View.GONE
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.StudyWithMeApplication
import ir.m3.rahmani.studywithme.databinding.ActivityMainBinding
import ir.m3.rahmani.studywithme.di.Injector
import ir.m3.rahmani.studywithme.home.HomeActivity
import ir.m3.rahmani.studywithme.login.onboarding.OnboardingActivity
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            delay(SPLASH_DURATION)
            checkLogin()
        }
    }

    private fun checkLogin() {
        viewModel.isLogin.observe(this) {
            decideToNavigate(it)
        }
    }

    private fun decideToNavigate(isLogin: Boolean) {
        if (isLogin) {
            val home = Intent(this,HomeActivity::class.java)
            startActivity(home)
        } else {
            val onboarding = Intent(this, OnboardingActivity::class.java)
            startActivity(onboarding)
        }
        finish()
    }

    companion object {
        private const val SPLASH_DURATION = 2500L
    }
}