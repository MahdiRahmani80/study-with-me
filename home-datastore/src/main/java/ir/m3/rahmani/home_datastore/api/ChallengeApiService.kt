package ir.m3.rahmani.home_datastore.api

import ir.m3.rahmani.home_datastore.model.Challenge
import ir.m3.rahmani.home_datastore.model.ChallengePost
import ir.m3.rahmani.home_datastore.model.Play
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Query

interface ChallengeApiService {

    @GET("bet.php")
    suspend fun getChallenges(): List<Challenge>

    @POST("bet.php")
    suspend fun postChallenge(@Body challenge: ChallengePost)

    @POST("play.php")
    suspend fun addPlay(@Body play: Play)

    @GET("play.php")
    suspend fun getPlayById(@Query("id") id: String): Flow<Play>

    @PUT("play.php")
    suspend fun updatePlay(@Query("id") id: String, @Body play: Play)
}