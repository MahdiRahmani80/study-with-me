package ir.m3.rahmani.core.shared

import android.app.Application
import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import ir.m3.rahmani.core.shared.model.UserSharedPref
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserSharedPreferenceRepository @Inject constructor(
    private val app: Application
) {

    private val context = app.applicationContext

    val USER_PREF_NAME = "user_pref"
    private val Context.dataStore by preferencesDataStore(name = USER_PREF_NAME)

    val getUserSharedData: Flow<UserSharedPref> = context.dataStore.data.map { prefs ->
        val isLogin = prefs[PrefKeys.IS_LOGIN] ?: false
        val id = prefs[PrefKeys.ID].toString()
        val username = prefs[PrefKeys.USERNAME].toString()
        val level = prefs[PrefKeys.LEVEL] ?: 1
        val coin = prefs[PrefKeys.COIN] ?: 143
        val phone = prefs[PrefKeys.PHONE].toString()
        val state = prefs[PrefKeys.STATE] ?: 0
        val challengeMode = prefs[PrefKeys.CHALLENGE_MODE] ?: false
        val playId = prefs[PrefKeys.PLAY_ID].toString()

        UserSharedPref(
            isLogin = isLogin,
            id = id,
            username = username,
            level = level,
            coin = coin,
            phone = phone,
            userLastState = state,
            challengeMode = challengeMode,
            playId = playId
        )
    }

    suspend fun setUserData(user: UserSharedPref) {
        context.dataStore.edit { prefs -> prefs[PrefKeys.IS_LOGIN] = user.isLogin }
        context.dataStore.edit { prefs -> prefs[PrefKeys.ID] = user.id ?: "" }
        context.dataStore.edit { prefs -> prefs[PrefKeys.USERNAME] = user.username }
        context.dataStore.edit { prefs -> prefs[PrefKeys.PHONE] = user.phone }
        context.dataStore.edit { prefs -> prefs[PrefKeys.LEVEL] = user.level }
        context.dataStore.edit { prefs -> prefs[PrefKeys.COIN] = user.coin }
        context.dataStore.edit { prefs -> prefs[PrefKeys.STATE] = user.userLastState }
        context.dataStore.edit { prefs -> prefs[PrefKeys.CHALLENGE_MODE] = user.challengeMode }
        context.dataStore.edit { prefs -> prefs[PrefKeys.PLAY_ID] = user.playId?.toInt() ?: -1 }
    }

    private object PrefKeys {
        val PLAY_ID = intPreferencesKey("play_id")
        val STATE = intPreferencesKey("state")
        val IS_LOGIN = booleanPreferencesKey("isLogin")
        val ID = stringPreferencesKey("id")
        val USERNAME = stringPreferencesKey("username")
        val LEVEL = intPreferencesKey("level")
        val COIN = intPreferencesKey("coin")
        val PHONE = stringPreferencesKey("phone")
        val CHALLENGE_MODE = booleanPreferencesKey("challenge_mode")
    }
}