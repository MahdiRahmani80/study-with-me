package ir.m3.rahmani.studywithme.home

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.DialogFragment
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.DialogBuyCoinBinding

class BuyCoinDialog() : DialogFragment() {

    var onItemClick: ((String) -> Unit)? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val binding = DialogBuyCoinBinding.inflate(LayoutInflater.from(requireContext()))
        binding.buy500.setOnClickListener {
            onItemClick?.invoke(SKU_500)
            this.dismiss()
        }

        binding.buy1000.setOnClickListener {
            onItemClick?.invoke(SKU_1000)
            this.dismiss()
        }

        binding.buy2000.setOnClickListener {
            onItemClick?.invoke(SKU_2000)
            this.dismiss()
        }

        binding.buy10000.setOnClickListener {
            onItemClick?.invoke(SKU_10000)
            this.dismiss()
        }

        return AlertDialog.Builder(requireContext())
            .setView(binding.root)
            .setPositiveButton("بستن") { _, _ ->

            }
            .create()
    }


    companion object {
        const val TAG = "BuyCoinDialog"
        private const val SKU_500 = "buy_500"
        private const val SKU_1000 = "buy_1000"
        private const val SKU_2000 = "buy_2000"
        private const val SKU_10000 = "buy_10000"
    }
}