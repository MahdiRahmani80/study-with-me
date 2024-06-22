package ir.m3.rahmani.user_data


import ir.m3.rahmani.core.shared.UserSharedPreferenceRepository
import ir.m3.rahmani.user_data.api.UserApiServiceRepository
import ir.m3.rahmani.user_data.api.toApiModel
import ir.m3.rahmani.user_data.api.toExternal
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class UserRepository @Inject constructor(
    private val shared: UserSharedPreferenceRepository,
    private val repository: UserApiServiceRepository
) {

    suspend fun getUser(phone: String): Flow<User?> = flow {
        val user = repository.getUser(phone).firstOrNull()
        if (user != null) shared.setUserData(user.toExternal().toSharedPref())
        emit(user?.toExternal())
    }

    suspend fun addUser(user: User): Flow<Boolean> = flow {
        repository.addUser(user.toApiModel()).collect { isSuccess ->
            if (isSuccess) {
                delay(80)
                val userApi = repository.getUser(user.phone).firstOrNull()
                val saveSharedPref = user.toSharedPref()
                saveSharedPref.isLogin = isSuccess
                saveSharedPref.id = userApi?.id
                emit(isSuccess)
                shared.setUserData(saveSharedPref)
            }

        }
    }

}