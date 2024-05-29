package ir.m3.rahmani.studywithme.main

import android.os.Bundle
import android.view.View.GONE
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.material.snackbar.Snackbar
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.StudyWithMeApplication
import ir.m3.rahmani.studywithme.databinding.ActivityMainBinding
import ir.m3.rahmani.studywithme.di.Injector
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
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
            decideToNavigate()
        }
    }

    private fun decideToNavigate(){
        if (viewModel.isLogin.value == true) {
            // todo: go to home Screen
        } else {
            // todo: go to login Screen
        }
    }

    companion object{
        private const val SPLASH_DURATION = 2500L
    }
}