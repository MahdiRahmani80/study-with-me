package ir.m3.rahmani.user_data.api

import android.util.Log
import ir.m3.rahmani.user_data.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserApiServiceRepository @Inject constructor(
    private val api: UserApiService
) : UserDataStore {

    private val TAG = "UserApiServiceRepository"
    override fun getUser(phone: String): Flow<UserApiModel> = flow {
        try {
            val data = api.getUser(phone)
            emit(data)
        } catch (e: Exception) {
            Log.e(TAG, e.message.toString())
        }

    }

    override suspend fun addUser(user: UserApiModel): Flow<Boolean> = flow {
        var bool = false
        try {
            api.createUser(user)
        } catch (e: Exception) {
            Log.e(TAG, e.message.toString())
            bool = !bool
        } finally {
            emit(!bool)
        }
    }

    override suspend fun updateUser(user: User): Flow<Boolean> = flow {
        var boolean = false
        try {
            api.updateUser(user.id.toString(),user.toApiModel())
        } catch (e:Exception){
            Log.e(TAG, e.message.toString())
            boolean = !boolean
        }finally {
            emit(!boolean)
        }
    }

}