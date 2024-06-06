package ir.m3.rahmani.studywithme.home.challenge.data

import ir.m3.rahmani.core.shared.model.UserSharedPref
import ir.m3.rahmani.home_datastore.model.Challenge

data class NotifyChallenge (
    val challenges: List<Challenge> = emptyList(),
    val user: UserSharedPref? = null

)
