package ir.m3.rahmani.studywithme.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MainViewModel @Inject constructor(
    private val sharedPref: UserSharedPreferenceRepository
) : ViewModel() {

    init {
        isLogin()
    }

    private val _isLogin: MutableStateFlow<Boolean> by lazy {
        MutableStateFlow(false)
    }
    val isLogin:LiveData<Boolean> = _isLogin.asLiveData()

    private fun isLogin() {
        viewModelScope.launch {
            sharedPref.getUserSharedData.collect { userData ->
                _isLogin.value = userData.isLogin
            }
        }
    }

}