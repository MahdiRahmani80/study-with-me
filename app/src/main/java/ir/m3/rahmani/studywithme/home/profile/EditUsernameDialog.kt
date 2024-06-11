package ir.m3.rahmani.studywithme.home.profile

import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.DialogEditUsernameBinding
import javax.inject.Inject

class EditUsernameDialog(
    context: Context,
    private val viewModel: ProfileViewModel
) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val binding = DialogEditUsernameBinding.inflate(LayoutInflater.from(context))
        return AlertDialog.Builder(requireContext())
            .setView(binding.root)
            .setPositiveButton(getString(R.string.save)) { _, _ ->
                val text = binding.etEditUsername.text.toString()
                viewModel.saveNewUsername(text)
            }
            .create()
    }



    companion object {
        const val TAG = "EditUsernameText"
    }
}