package ir.m3.rahmani.studywithme.home

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import ir.m3.rahmani.studywithme.R

class YouLoseDialog : DialogFragment() {


    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setMessage(requireContext().getString(R.string.you_are_lost))
            .create()

    companion object {
        const val TAG = "YouLoseDialog"
    }
}