package ir.m3.rahmani.user_data


import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import ir.m3.rahmani.user_data.api.UserApiServiceRepository
import ir.m3.rahmani.user_data.api.toApiModel
import ir.m3.rahmani.user_data.api.toExternal
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val shared: UserSharedPreferenceRepository,
    private val repository: UserApiServiceRepository
) {

    fun getUser(phone: String): Flow<User> {
        return repository.getUser(phone).map { it.toExternal() }
    }

    suspend fun addUser(user: User) {
        repository.addUser(user.toApiModel()).collect { isSuccess ->
            val saveSharedPref = user.toSharedPref()
            saveSharedPref.isLogin = isSuccess
            if (isSuccess) shared.setUserData(saveSharedPref)

        }
    }

}