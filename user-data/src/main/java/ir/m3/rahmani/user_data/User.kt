package ir.m3.rahmani.user_data

import ir.m3.rahmani.core.shared.UserSharedPref

data class User(
    val coin: Int = 143,
    val id: String? = null,
    val level: Int = 1 ,
    val phone: String,
    val username: String
)

fun User.toSharedPref() = UserSharedPref(
    coin = coin,
    id = id,
    level = level,
    phone = phone,
    username = username
)

fun UserSharedPref.toUser() = User(
    coin = coin,
    id = id,
    level = level,
    phone = phone,
    username = username
)