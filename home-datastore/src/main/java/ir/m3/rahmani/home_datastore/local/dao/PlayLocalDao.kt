package ir.m3.rahmani.home_datastore.local.dao

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert
import ir.m3.rahmani.home_datastore.local.model.PlayLocal
import kotlinx.coroutines.flow.Flow

@Dao
interface PlayLocalDao {

    @Upsert
    suspend fun upsertPlay(play: PlayLocal)

    @Query("SELECT * FROM play WHERE isFinished = false LIMIT 1")
    fun getOnProgressPlay(): Flow<PlayLocal>

    @Query("SELECT * FROM play ")
    fun getAllPlays(): Flow<List<PlayLocal>>

}