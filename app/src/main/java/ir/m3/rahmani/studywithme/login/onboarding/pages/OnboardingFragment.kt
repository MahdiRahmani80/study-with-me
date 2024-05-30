package ir.m3.rahmani.studywithme.login.onboarding.pages

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.FragmentOnboardingBinding
import ir.m3.rahmani.studywithme.di.Injector
import ir.m3.rahmani.studywithme.login.onboarding.OnboardingActivity
import ir.m3.rahmani.studywithme.login.register.RegisterActivity
import ir.m3.rahmani.studywithme.login.signin.SigninActivity
import javax.inject.Inject


class OnboardingFragment (
    private val data: OnboardingPagerData
) : Fragment() {

    private var _binding: FragmentOnboardingBinding? = null
    private val binding get() = _binding!!
    private val isLastPage = data.item == OnboardingActivity.SCREEN_NUMBERS
    private lateinit var context: Context

    private val image = data.image
    private val item = data.item
    private val text = data.text

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.context = context
        val application = requireActivity().application
        Injector.inject(application, this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOnboardingBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        isLastPageView()
        binding.img.setImageResource(image)
        binding.text.text = text
        binding.counter.text = setCounterText(item)
        clickListener()
    }

    private fun isLastPageView() {
        if (isLastPage) binding.lastPage.visibility = View.VISIBLE
    }

    private fun setCounterText(count: Int): String {
        var text = ""
        val icon = getString(R.string.happy_face)
        repeat(count) {
            text += icon
        }
        return text
    }

    fun clickListener() {
        binding.btnSignup.setOnClickListener {
            startActivity(Intent(context, SigninActivity::class.java))
            activity?.finish()
        }
        binding.tvSignin.setOnClickListener {
            startActivity(Intent(context, RegisterActivity::class.java))
            activity?.finish()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}