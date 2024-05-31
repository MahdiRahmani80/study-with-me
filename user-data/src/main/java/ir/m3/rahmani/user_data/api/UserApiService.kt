package ir.m3.rahmani.user_data.api

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface UserApiService {

    @GET("users.php?phone={phone}")
    suspend fun getUser(@Path("phone") phone: String): UserApiModel

    @POST("users.php")
    suspend fun createUser(@Body userApiModel: UserApiModel)

}