package ir.m3.rahmani.user_data.api

import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserApiServiceRepository @Inject constructor(
    private val api:UserApiService
) : UserDataStore {

    override fun getUser(phone: String): Flow<UserApiModel> = flow {
        try {
            val data = api.getUser(phone)
            emit(data)
        } catch (e: Exception) {
            Log.e("UserApiServiceRepository", e.message.toString())
        }

    }

    override suspend fun addUser(user: UserApiModel): Flow<Boolean> = flow {
        var bool = false
        try {
            api.createUser(user)
        } catch (e: Exception) {
            Log.e("UserApiServiceRepository", e.message.toString())
            bool = !bool
        } finally {
            emit(!bool)
        }
    }

}