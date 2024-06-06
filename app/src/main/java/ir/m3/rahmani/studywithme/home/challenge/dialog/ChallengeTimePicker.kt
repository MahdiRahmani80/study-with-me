package ir.m3.rahmani.studywithme.home.challenge.dialog

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.DialogDatePickerBinding
import ir.m3.rahmani.studywithme.databinding.DialogTimePickerBinding

class ChallengeTimePicker : DialogFragment() {

    private lateinit var binding: DialogTimePickerBinding
    var onSaveClick: ((time: String) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogTimePickerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.save.setOnClickListener {
            val hour: Int = binding.timePicker.hour
            val minute: Int = binding.timePicker.minute
            onSaveClick?.invoke(makeTime(hour,minute))
            this.dismiss()
        }
    }

    private fun makeTime(h: Int, m: Int) :String{
        val h = if (h < 10) "0$h" else "$h"
        val m = if (m < 10) "0$m" else "$m"
        return "$h:$m"
    }

    companion object {
        const val TAG = "ChallengeTimePicker"
    }
}