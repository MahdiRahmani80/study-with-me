package ir.m3.rahmani.studywithme.home.challenge.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ir.m3.rahmani.home_datastore.model.Challenge
import ir.m3.rahmani.studywithme.databinding.BottomSheetAddChallengeBinding
import ir.m3.rahmani.studywithme.home.challenge.ChallengeViewModel
import javax.inject.Inject

class ChallengeBottomSheet @Inject constructor(
    private val challengeViewModel: ChallengeViewModel
) : BottomSheetDialogFragment() {

    private lateinit var binding: BottomSheetAddChallengeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetAddChallengeBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.coinPicker.minValue = MIN_COIN
        binding.coinPicker.maxValue = MAX_COIN
        binding.targetPicker.minValue = MIN_TARGET
        binding.targetPicker.maxValue = MAX_TARGET

        startTime()
        endTime()

        binding.btnSave.setOnClickListener {
            saveNewChallenge()
        }
    }

    private fun saveNewChallenge() {
        challengeViewModel.userName.observe(requireActivity()) {
            if (it != null) {
                val challenge = Challenge(
                    coin = binding.coinPicker.value.toString(),
                    target = binding.targetPicker.value.toString(),
                    start = timeStart + ":00",
                    end = timeEnd + ":00",
                    request_id = it.id.toString()
                )

                challengeViewModel.addChallenge(challenge)
                this.dismiss()
            }
        }
    }

    private fun startTime() {
        val challengeDatePicker = ChallengeDatePicker()

        binding.startChallengeDatetime.setOnClickListener {
            challengeDatePicker.show(childFragmentManager, ChallengeDatePicker.TAG)
        }

        challengeDatePicker.onSave = {
            timeStart = it
            binding.startChallengeDatetime.text = timeStart
        }
    }

    private fun endTime() {
        val challengeDatePicker = ChallengeDatePicker()

        binding.endChallengeDatetime.setOnClickListener {
            challengeDatePicker.show(childFragmentManager, ChallengeDatePicker.TAG)
        }

        challengeDatePicker.onSave = {
            timeEnd = it
            binding.endChallengeDatetime.text = timeEnd
        }
    }

    companion object {
        var timeStart = ""
        var timeEnd = ""

        const val MIN_TARGET = 4
        const val MAX_TARGET = 200
        const val MIN_COIN = 25
        const val MAX_COIN = 1000
    }

}