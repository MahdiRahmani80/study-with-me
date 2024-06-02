package ir.m3.rahmani.user_data.api

import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface UserApiService {

    @GET("users.php")
    suspend fun getUser(@Query("phone") phone: String): UserApiModel

    @POST("users.php")
    suspend fun createUser(@Body user: UserApiModel)

    @PUT("users.php")
    suspend fun updateUser(@Query("id") id: String, @Body user: UserApiModel)
}