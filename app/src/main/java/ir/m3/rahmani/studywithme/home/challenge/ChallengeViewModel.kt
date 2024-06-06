package ir.m3.rahmani.studywithme.home.challenge

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import ir.m3.rahmani.core.shared.model.UserSharedPref
import ir.m3.rahmani.home_datastore.api.ChallengeRepository
import ir.m3.rahmani.home_datastore.local.repository.PlayLocalRepository
import ir.m3.rahmani.home_datastore.model.Challenge
import ir.m3.rahmani.studywithme.home.challenge.data.NotifyChallenge
import ir.m3.rahmani.user_data.api.UserApiServiceRepository
import ir.m3.rahmani.user_data.toExternal
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ChallengeViewModel @Inject constructor(
    private val challengeRepository: ChallengeRepository,
    private val sharedPreferenceRepository: UserSharedPreferenceRepository,
    private val playLocalRepository: PlayLocalRepository,
    private val userApiServiceRepository: UserApiServiceRepository
) : ViewModel() {

    private val _notifyChallenges: MutableStateFlow<NotifyChallenge> by lazy {
        MutableStateFlow(NotifyChallenge())
    }
    val challenges = _notifyChallenges.asLiveData()
    private val _userName: MutableStateFlow<UserSharedPref?> by lazy {
        MutableStateFlow(null)
    }
    val userName = _userName.asLiveData()


    fun addChallenge(challenge: Challenge) {
        viewModelScope.launch {
            challengeRepository.addChallenge(challenge).firstOrNull()
        }
    }

    fun startChallenge(challenge: Challenge) {
        viewModelScope.launch {
            challengeRepository
                .startChallenge(challenge.bet_id, _notifyChallenges.value.user?.id)
                .firstOrNull()

            val user = _notifyChallenges.value.user
            if (user != null) {
                sharedPreferenceRepository.setUserData(user)
            }
            user?.playId = challenge.bet_id
            user?.challengeMode = true
            if (_notifyChallenges.value.user != null)
                user?.coin = _notifyChallenges.value.user?.coin!! - challenge.coin.toInt()
            if (user != null) {
                sharedPreferenceRepository.setUserData(user)
                userApiServiceRepository.updateUser(user.toExternal()).firstOrNull()
            }
            playLocalRepository.addPlay(challenge)
        }
    }

    private fun getChallengeMode() {
        viewModelScope.launch {
            sharedPreferenceRepository.getUserSharedData.collect {
                _notifyChallenges.value = _notifyChallenges.value.copy(user = it)
            }
        }
    }

    private fun getUserName() {
        viewModelScope.launch {
            sharedPreferenceRepository.getUserSharedData.collect {
                _userName.value = it
            }
        }
    }


    init {
        viewModelScope.launch {
            getChallengeMode()
            getUserName()
            challengeRepository.getChallenges().collect {
                _notifyChallenges.value = _notifyChallenges.value.copy(challenges = it)
            }
        }
    }
}