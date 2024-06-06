package ir.m3.rahmani.studywithme.home.challenge

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.FragmentChallengeBinding
import ir.m3.rahmani.studywithme.di.Injector
import ir.m3.rahmani.studywithme.home.challenge.dialog.ChallengeBottomSheet
import javax.inject.Inject

class ChallengeFragment @Inject constructor() : Fragment() {

    private var _binding: FragmentChallengeBinding? = null
    private val binding get() = _binding!!
    private lateinit var context: Context

    @Inject
    lateinit var viewModel: ChallengeViewModel

    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.context = context
        Injector.inject(requireActivity().application, this)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentChallengeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        listener()

        binding.recycler.layoutManager = LinearLayoutManager(context)

        startChallenge()
    }

    private fun startChallenge() {
        viewModel.challenges.observe(requireActivity()) { notify ->
            val adopter = ChallengeAdapter(notify.challenges)
            binding.recycler.adapter = adopter
            adopter.onItemClick = { challenge ->
                if (notify.user?.challengeMode == false) {
                    val isCoinEnough = notify.user.coin >= challenge.coin.toInt()
                    if (isCoinEnough) {
                        viewModel.startChallenge(challenge)
                        showSnackbar(getString(R.string.decreased_your_coin, challenge.coin))
                    } else {
                        showSnackbar(getString(R.string.not_enough_coin))
                    }
                } else {
                    showSnackbar(getString(R.string.you_have_already_in_challenge))
                }
            }
        }
    }

    private fun listener() {
        binding.fabAddChallenge.setOnClickListener {
            val bottomSheet = ChallengeBottomSheet(viewModel)
            bottomSheet.show(requireActivity().supportFragmentManager, "BottomSheetDialog")
        }
    }

    private fun showSnackbar(message: String) {
        val bar = Snackbar.make(context, binding.root, message, Snackbar.LENGTH_SHORT)
        bar.view.layoutDirection = View.LAYOUT_DIRECTION_RTL
        bar.show()
    }
}