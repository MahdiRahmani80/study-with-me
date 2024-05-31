package ir.m3.rahmani.studywithme.login.register

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.user_data.User
import ir.m3.rahmani.user_data.UserRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class RegisterViewModel @Inject constructor(
    private val userRepository: UserRepository,
) : ViewModel() {


    fun addUser(username: String, phone: String) {
        val user = User(username = username, phone = phone)
        viewModelScope.launch {
            userRepository.addUser(user)
        }
    }

}