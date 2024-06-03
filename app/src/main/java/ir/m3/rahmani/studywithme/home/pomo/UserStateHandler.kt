package ir.m3.rahmani.studywithme.home.pomo

import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import ir.m3.rahmani.core.shared.model.UserSharedPref
import ir.m3.rahmani.core.utils.ui.compose.clock.PomodoroConstants
import ir.m3.rahmani.user_data.User
import ir.m3.rahmani.user_data.toSharedPref
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.last
import kotlinx.coroutines.launch

object UserStateHandler {

    /**
     * 0 -> WORK
     * 1 -> SHORT BREAK
     * 2-> LONG BREAK
     */

    suspend fun userLastState(
        sharedPref: UserSharedPreferenceRepository
    ): Int {
        val userLastState = sharedPref.getUserSharedData.first().userLastState
        return userLastState
    }


    suspend fun newStateUser(
        sharedPref: UserSharedPreferenceRepository,
        state: Int,
        leftToLongBreak: Int
    ): Int {
        val newState = when (state) {
            0 -> if (leftToLongBreak == 1) 2 else 1
            1 -> 0
            2 -> 0
            else -> 0
        }


        return newState

    }

    fun getTimeByState(state: Int): Int {
        return when (state) {
            0 -> PomodoroConstants.POMODORO_STUDY_TIME_BY_MINUTES
            1 -> PomodoroConstants.POMODORO_SHORT_BREAK_TIME_BY_MINUTES
            2 -> PomodoroConstants.POMODORO_LONG_BREAK_TIME_BY_MINUTES
            else -> PomodoroConstants.POMODORO_STUDY_TIME_BY_MINUTES
        }
    }
}