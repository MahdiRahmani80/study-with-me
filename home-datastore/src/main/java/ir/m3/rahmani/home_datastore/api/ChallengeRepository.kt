package ir.m3.rahmani.home_datastore.api

import android.util.Log
import ir.m3.rahmani.home_datastore.local.model.PlayLocal
import ir.m3.rahmani.home_datastore.model.Challenge
import ir.m3.rahmani.home_datastore.model.Play
import ir.m3.rahmani.home_datastore.model.toPlay
import ir.m3.rahmani.home_datastore.model.toPost
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ChallengeRepository @Inject constructor(
    private val challengeApiService: ChallengeApiService
) {

    private val TAG = "ChallengeRepositoryApiService"

    suspend fun getChallenges(): Flow<ArrayList<Challenge>> = flow {
        try {
            val result = ArrayList<Challenge>()
            challengeApiService.getChallenges().map {
                if (it.status == "0")
                    result.add(it)
            }
            emit(result)

        } catch (e: Exception) {
            Log.e(TAG, e.toString())
        }
    }

    suspend fun getChallengeById(id: String): Flow<Challenge?> = flow {

        var result: Challenge? = null
        try {
            result = challengeApiService.getChallengeById(id)
        } catch (e: Exception) {
            Log.e(TAG, e.toString())
        } finally {
            emit(result)
        }
    }

    suspend fun getPlayById(id: String): Flow<Play?> = flow {
        try {
            val result = challengeApiService.getPlayById(id).firstOrNull()
            emit(result)
        } catch (e: Exception) {
            Log.e(TAG, e.toString())
        }
    }

    suspend fun addChallenge(challenge: Challenge): Flow<Boolean> = flow {
        var isSuccessful = true
        try {
            challengeApiService.postChallenge(challenge.toPost())
        } catch (e: Exception) {
            Log.e(TAG, e.toString())
            isSuccessful = !isSuccessful
        } finally {
            emit(isSuccessful)
        }
    }

    suspend fun updatePlay(play: PlayLocal, progress: Int): Flow<Boolean> = flow {
        val p = play.toPlay()
        p.progress = progress.toString()
        try {
            challengeApiService.updatePlay(p.id.toString(), p)
        } catch (e: Exception) {
            Log.e(TAG, e.toString())
        }
    }

    suspend fun startChallenge(challengeId: String?, user_id: String?): Flow<Boolean> = flow {
        var isSuccess = true
        try {
            if (challengeId != null && user_id != null) {
                val play = Play(
                    bet = challengeId,
                    champion = user_id,
                )
                challengeApiService.addPlay(play)
            }
        } catch (e: Exception) {
            Log.e(TAG, e.toString())
            isSuccess = !isSuccess
        } finally {
            emit(isSuccess)
        }
    }

    suspend fun updateChallenge(id: String, challenge: Challenge): Flow<Boolean> = flow {
        var isSuccess = true
        try {
            challengeApiService.updateChallenge(id, challenge)
        } catch (e: Exception) {
            Log.e(TAG, e.toString())
            isSuccess = !isSuccess
        } finally {
            emit(isSuccess)
        }
    }

    suspend fun getPlays(id: Int): Flow<List<Play>> = flow {
        val result = arrayListOf<Play>()
        try {
            challengeApiService.getPlayPerBet(id.toString()).map {
                result.add(it)
            }
        } catch (e: Exception) {
            Log.e(TAG, e.toString())
        } finally {
            emit(result)
        }
    }
}