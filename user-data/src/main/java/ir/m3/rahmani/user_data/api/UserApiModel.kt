package ir.m3.rahmani.user_data.api

import ir.m3.rahmani.user_data.User

data class UserApiModel(
    val coin: Int,
    var id: String? = null,
    val level: Int = 1,
    val phone: String,
    val username: String
)


fun UserApiModel.toExternal(): User {
    return User(
        id = id,
        username = username,
        coin = coin,
        level = level,
        phone = phone,
    )
}

fun User.toApiModel(): UserApiModel {
    return UserApiModel(
        id = id,
        username = username,
        coin = coin,
        level = level,
        phone = phone
    )
}