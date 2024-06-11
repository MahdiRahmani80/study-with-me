package ir.m3.rahmani.studywithme.home.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import ir.m3.rahmani.user_data.api.UserApiServiceRepository
import ir.m3.rahmani.user_data.toExternal
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ProfileViewModel @Inject constructor(
    private val repository: UserApiServiceRepository,
    private val preferenceRepository: UserSharedPreferenceRepository
) : ViewModel() {

    fun saveNewUsername(newUsername: String) {
        viewModelScope.launch {
            val username = newUsername.trim()
            val user = preferenceRepository.getUserSharedData.first()
            user.username = newUsername
            preferenceRepository.setUserData(user)
            repository.updateUser(user.toExternal()).first()

        }
    }
}