package ir.m3.rahmani.studywithme.login.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.user_data.User
import ir.m3.rahmani.user_data.UserRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class RegisterViewModel @Inject constructor(
    private val userRepository: UserRepository,
) : ViewModel() {


    private val _isAddUserSuccessful:MutableStateFlow<Boolean> by lazy {
        MutableStateFlow(false)
    }
    val isAddUserSuccessful get() = _isAddUserSuccessful.asLiveData()

    fun addUser(username: String, phone: String) {
        val user = User(username = username, phone = phone)
        viewModelScope.launch {
            userRepository.addUser(user).collect{
                _isAddUserSuccessful.value = it
            }
        }
    }

}