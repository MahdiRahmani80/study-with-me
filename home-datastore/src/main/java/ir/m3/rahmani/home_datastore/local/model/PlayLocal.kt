package ir.m3.rahmani.home_datastore.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("play")
data class PlayLocal(
    @PrimaryKey val id: String,
    var readPomo: Int =0,
    val target: Int,
    var isFinished: Boolean = false,
    var isWin: Boolean? = null,
    val coin: Int,
    val userRequest: String,
    val bet:Int? = null
)
