package ir.m3.rahmani.studywithme.home.pomo

import android.content.Context
import android.view.View
import androidx.core.view.ViewCompat
import com.google.android.material.snackbar.Snackbar
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants
import ir.m3.rahmani.studywithme.R
import ir.m3.rahmani.studywithme.databinding.FragmentPomodoroBinding

object PomodoroUiHelper {

    fun iconHandler(
        state: TimerState,
        binding: FragmentPomodoroBinding,
        context: Context
    ) {
        when (state) {
            TimerState.NOT_STARTED -> {
                binding.imgNext.visibility = View.GONE
                binding.imgStop.visibility = View.GONE
                binding.imgPlay.setImageResource(R.drawable.play)
                binding.pomodoroStatus.text = context.getString(R.string.pomo_status)
            }

            TimerState.IN_PROGRESS -> {
                binding.imgPlay.setImageResource(R.drawable.pause)
                binding.imgNext.visibility = View.VISIBLE
                binding.imgStop.visibility = View.VISIBLE
                binding.pomodoroStatus.text = context.getString(R.string.pomo_status_study)
            }

            TimerState.DONE -> {
                binding.imgNext.visibility = View.GONE
                binding.imgStop.visibility = View.GONE
                binding.imgPlay.setImageResource(R.drawable.play)
                binding.pomodoroStatus.text = context.getString(R.string.pomo_status)
            }

            TimerState.PAUSE -> {
                binding.imgNext.visibility = View.VISIBLE
                binding.imgStop.visibility = View.VISIBLE
                binding.imgPlay.setImageResource(R.drawable.play)
                binding.pomodoroStatus.text = context.getString(R.string.pomo_status_study_pause)
            }
        }
    }

    fun showSanckbarWhenDone(
        context: Context,
        binding: FragmentPomodoroBinding
    ) {
        val prizeCount = PomodoroConstants.POMODORO_WHEN_POMODORO_DONE_PRIZE.toString()
        val snackbar = Snackbar.make(
            context, binding.root, context.getString(R.string.snakbar_done_pomo, prizeCount),
            Snackbar.LENGTH_LONG
        )
        snackbar.view.layoutDirection = View.LAYOUT_DIRECTION_RTL
        snackbar.show()
    }
}