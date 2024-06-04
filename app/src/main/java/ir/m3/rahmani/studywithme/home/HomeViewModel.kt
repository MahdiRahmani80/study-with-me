package ir.m3.rahmani.studywithme.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import ir.m3.rahmani.user_data.User
import ir.m3.rahmani.user_data.toExternal
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeViewModel @Inject constructor(
    private val userSharedPref: UserSharedPreferenceRepository
) : ViewModel() {

    init {
        getUserData()
    }

    private val _userData: MutableStateFlow<User?> by lazy {
        MutableStateFlow(null)
    }
    val userData: LiveData<User?> = _userData.asLiveData()

    private fun getUserData() {
        viewModelScope.launch {
            userSharedPref.getUserSharedData.collect {user->
                _userData.value = user.toExternal()
            }
        }
    }

}

