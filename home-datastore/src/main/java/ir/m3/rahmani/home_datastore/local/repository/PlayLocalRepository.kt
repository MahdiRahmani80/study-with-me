package ir.m3.rahmani.home_datastore.local.repository

import ir.m3.rahmani.home_datastore.local.dao.PlayLocalDao
import ir.m3.rahmani.home_datastore.local.model.PlayLocal
import ir.m3.rahmani.home_datastore.model.Challenge
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.flow.flow
import java.util.UUID
import javax.inject.Inject

class PlayLocalRepository @Inject constructor(
    private val playLocalDao: PlayLocalDao
) {

    suspend fun addPlay(challenge: Challenge) {
        val uuid = UUID.randomUUID().toString()
        val play = PlayLocal(
            target = challenge.target.toInt(),
            coin = challenge.coin.toInt(),
            id = uuid,
            bet = challenge.bet_id?.toInt(),
            userRequest = challenge.user_requested_username.toString()
        )
        playLocalDao.upsertPlay(play)
    }

    suspend fun updatePlay(play:PlayLocal){
        playLocalDao.upsertPlay(play)
    }

    suspend fun getPlay(): Flow<PlayLocal?> = flow {
        playLocalDao.getOnProgressPlay().collect{
            emit(it)
        }
    }
}