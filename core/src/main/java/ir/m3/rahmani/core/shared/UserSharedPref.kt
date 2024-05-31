package ir.m3.rahmani.core.shared

data class UserSharedPref(
    var isLogin: Boolean = false,
    var id: String? = null,
    var username: String = "john due",
    var level: Int = 1,
    var coin: Int = 143,
    var phone: String = "[+98] 912 (345) 6789"
)

