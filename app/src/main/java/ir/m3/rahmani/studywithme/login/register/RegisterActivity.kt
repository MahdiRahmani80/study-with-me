package ir.m3.rahmani.studywithme.login.register

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.ActivityOnboardingBinding
import ir.m3.rahmani.studywithme.databinding.ActivityRegisterBinding
import ir.m3.rahmani.studywithme.di.Injector
import ir.m3.rahmani.studywithme.home.HomeActivity
import javax.inject.Inject

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    @Inject
    lateinit var viewModel: RegisterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.inject(this)
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        listener()
        goToHome()
    }

    private fun listener() {
        binding.btnRegister.setOnClickListener {
            if (checkRegister()) {
                val username = binding.etUsername.text.toString()
                val phoneNumber = binding.etPhone.text.toString()
                showSnackbar(getString(R.string.please_wait))
                viewModel.addUser(username, phoneNumber)
            }
        }
    }

    private fun goToHome() {
        viewModel.isAddUserSuccessful.observe(this) {
            if (it) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun checkRegister(): Boolean {
        val phoneNumberCheck = binding.etPhone.text?.length == 11
        val userNameCheck = binding.etUsername.text?.isNotEmpty() == true
        val phoneCheckZeroAtFirst = binding.etPhone.text?.startsWith("0") == true
        val userNameMustMoreThatThree = binding.etUsername.text?.length!! > 3

        val checker = (phoneNumberCheck &&
                userNameCheck &&
                phoneCheckZeroAtFirst &&
                userNameMustMoreThatThree
                )
        return checker

    }

    private fun showSnackbar(text: String) {
        val view = binding.root
        val snackbar = Snackbar.make(this, view, text, Snackbar.LENGTH_LONG)
        snackbar.view.layoutDirection = View.LAYOUT_DIRECTION_RTL
        snackbar.show()
    }
}