package ir.m3.rahmani.studywithme.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import ir.m3.rahmani.home_datastore.model.Challenge
import ir.m3.rahmani.home_datastore.model.Play
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.BottomSheetAddChallengeBinding
import ir.m3.rahmani.studywithme.databinding.BottomSheetChallengeStatusBinding
import javax.inject.Inject
import javax.inject.Singleton

//@Singleton
class ChallengeStatusBottomSheet @Inject constructor(
    private val challengeList: List<Play>,
    private val homeViewModel: HomeViewModel
) : BottomSheetDialogFragment() {

    private var _binding: BottomSheetChallengeStatusBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetChallengeStatusBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var body: String = ""
        challengeList.map {
            val seperator = "\u200e"
            val startDate = seperator + it.play_started + seperator
            body += getString(R.string.bottom_sheet_challenge_status_body_champ, startDate)
        }

        binding.body.text = getString(
            R.string.bottom_sheet_challenge_status_body,
            getString(R.string.challenge_in_progress),
            challengeList.size.toString(),
            body
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "ChallengeStatusBottomSheet"
    }
}