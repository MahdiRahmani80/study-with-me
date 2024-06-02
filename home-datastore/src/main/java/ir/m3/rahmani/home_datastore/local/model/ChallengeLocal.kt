package ir.m3.rahmani.home_datastore.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ChallengeLocal(
    @PrimaryKey val id: Int,
)
