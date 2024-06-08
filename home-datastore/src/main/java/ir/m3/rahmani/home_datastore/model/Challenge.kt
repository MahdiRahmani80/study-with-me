package ir.m3.rahmani.home_datastore.model

data class Challenge(
    var bet_id: String? = null,
    val coin: String,
    var date: String? = null,
    val end: String? = null,
    val request_id: String?= null,
    val start: String? = null,
    var status: String? = null,
    var user_level: String? = null,
    var user_requested_username: String?= null,
    val target:String
)

data class ChallengePost(
    val coin: String,
    val end: String,
    val request_id: String,
    val start: String,
    val target:String,
    val status: String? = "0",
)

fun Challenge.toPost()= ChallengePost (
    coin = coin,
    end = end.toString(),
    request_id = request_id.toString(),
    start = start.toString(),
    target = target,
)
