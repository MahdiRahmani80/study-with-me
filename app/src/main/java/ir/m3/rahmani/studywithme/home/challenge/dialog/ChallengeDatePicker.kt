package ir.m3.rahmani.studywithme.home.challenge.dialog

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import ir.m3.rahmani.studywithme.databinding.DialogDatePickerBinding
import java.util.Calendar

class ChallengeDatePicker : DialogFragment() {

    private lateinit var binding: DialogDatePickerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogDatePickerBinding.inflate(inflater, container, false)
        return binding.root
    }

    var onSave: ((String) -> Unit)? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val dialog = ChallengeTimePicker()


        binding.setTime.setOnClickListener {
            dialog.show(childFragmentManager, ChallengeTimePicker.TAG)
        }

        dialog.onSaveClick = {
            time = it
            binding.setTime.text = it
        }

        binding.cal.minDate = Calendar.getInstance().timeInMillis


        binding.cal.setOnDateChangeListener { view, year, month, dayOfMonth ->
            date = "$year-${month + 1}-$dayOfMonth"

        }
        binding.save.setOnClickListener {
            val datetime = "$date $time"
            onSave?.invoke(datetime)
            this.dismiss()
        }
    }


    companion object {
        const val TAG = "ChallengeDatePicker"
        var time: String = "00:00"
        var date = ""

    }
}

