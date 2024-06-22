package ir.m3.rahmani.studywithme.login.signin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ir.m3.rahmani.user_data.UserRepository
import ir.m3.rahmani.user_data.api.UserApiServiceRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import javax.inject.Inject

class SigninViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    fun getUserPhone(ph: String): LiveData<Boolean> {
        val result = MutableLiveData<Boolean>(false)
        viewModelScope.launch {
            val user = userRepository.getUser(ph).firstOrNull()
            if (user != null) result.value = true
        }
        return result
    }
}