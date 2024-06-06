package ir.m3.rahmani.home_datastore.model

import ir.m3.rahmani.home_datastore.local.model.PlayLocal

data class Play(
    var bet: String,
    val champion: String,
    var id: String? = null,
    var play_started: String? = null,
    var progress: String? = null,
    var status: String = "0",
)


fun Play.toLocal(challenge: Challenge) = PlayLocal(
    id = id.toString(),
    target = challenge.target.toInt(),
    coin = challenge.coin.toInt(),
    userRequest = challenge.user_requested_username ?: "",
    bet = challenge.bet_id?.toInt()
)

fun PlayLocal.toPlay() = Play(
    id = id,
    bet = bet.toString(),
    champion = userRequest
)