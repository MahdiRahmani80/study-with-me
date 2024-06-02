package ir.m3.rahmani.user_data.api

import ir.m3.rahmani.user_data.User
import kotlinx.coroutines.flow.Flow


interface UserDataStore {

    fun getUser(phone:String): Flow<UserApiModel>

    suspend fun addUser(user: UserApiModel): Flow<Boolean>

    suspend fun updateUser(user: User): Flow<Boolean>

}