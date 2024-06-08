package ir.m3.rahmani.studywithme.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import ir.m3.rahmani.core.shared.model.UserSharedPref
import ir.m3.rahmani.home_datastore.api.ChallengeRepository
import ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository
import ir.m3.rahmani.home_datastore.model.Challenge
import ir.m3.rahmani.home_datastore.model.Play
import ir.m3.rahmani.studywithme.home.pomo.PomodoroViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeViewModel @Inject constructor(
    private val userSharedPref: UserSharedPreferenceRepository,
    private val challengeRepository: ChallengeRepository,
    private val playLocalRepository: PlayLocalRepository
) : ViewModel() {

    @Inject lateinit var pomodoroViewModel: PomodoroViewModel

    init {
        viewModelScope.launch {
            getUserData()
        }
    }


    private val _homeData: MutableStateFlow<ChallengeData> by lazy {
        MutableStateFlow(ChallengeData())
    }
    val homeData: LiveData<ChallengeData> = _homeData.asLiveData()

    val _lastestChallengeState: MutableStateFlow<Challenge?> by lazy {
        MutableStateFlow(null)
    }
    val lastestChallengeState: LiveData<Challenge?> = _lastestChallengeState.asLiveData()

    private suspend fun getUserData() {
        userSharedPref.getUserSharedData.collect {
            _homeData.value = _homeData.value.copy(user = it)
        }
    }

    fun getPlayData() {
        checkIsPlayProgress()
        viewModelScope.launch {
            if (_homeData.value.user?.playId != null)
                challengeRepository.getPlays(_homeData.value.user?.playId!!.toInt()).collect {
                    _homeData.value = _homeData.value.copy(plays = it)
                }
        }
    }


    private fun checkIsPlayProgress() {
        viewModelScope.launch {
            if (_homeData.value.plays.size > 0) {
                challengeRepository.getChallengeById(
                    _homeData.value.plays[0].bet.toString()
                ).collect {
                    _lastestChallengeState.value = it
                    if (it?.status?.toInt() == 1) {
                        // shared preferences
                        userSharedPref.setUserData(
                            _homeData.value.user!!.copy(challengeMode = false)
                        )
                        // database
                        val play = playLocalRepository.getPlay().first()
                        play?.let {
                            it.isFinished = true
                            it.isWin = false
                            try {
                                playLocalRepository.updatePlay(it)
                                pomodoroViewModel.getChallengeStatus()
                            } catch (e: Exception) {}
                        }

                    }
                }
            }
        }
    }
}

data class ChallengeData(
    var user: UserSharedPref? = null,
    val plays: List<Play> = emptyList()
)