package ir.m3.rahmani.studywithme.home.profile

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ir.m3.rahmani.studywithme.BazaarRateUsImpl
import ir.m3.rahmani.studywithme.databinding.FragmentProfileBinding
import ir.m3.rahmani.studywithme.di.Injector
import ir.m3.rahmani.studywithme.donate.DonateActivity
import ir.m3.rahmani.studywithme.utils.RateUs
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProfileFragment @Inject constructor() : Fragment() {

    @Inject
    lateinit var viewModel: ProfileViewModel
    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private lateinit var context: Context
    var buyCoinClick: (() -> Unit)? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.context = context
        val app = requireActivity().application
        Injector.inject(app, this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.header.editUsername.setOnClickListener {
            EditUsernameDialog(context, viewModel).show(
                childFragmentManager, EditUsernameDialog.TAG
            )
        }

        // to show a dialog and payment
        binding.header.buyCoin.setOnClickListener { buyCoinClick?.invoke() }

        binding.header.rateUs.setOnClickListener {
            val rateUs: RateUs = BazaarRateUsImpl()
            val intent = rateUs.rateUs()
            startActivity(intent)
        }

        val donateIntent = Intent(context, DonateActivity::class.java)
        binding.header.donate.setOnClickListener {
            startActivity(donateIntent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}