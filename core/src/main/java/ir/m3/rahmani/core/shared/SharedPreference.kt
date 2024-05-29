package ir.m3.rahmani.core.shared

import android.app.Application
import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import ir.m3.rahmani.core.di.CoreScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserSharedPreferenceRepository @Inject constructor(
    private val app:Application
) {

    private val context = app.applicationContext

    val USER_PREF_NAME = "user_pref"
    private val Context.dataStore by preferencesDataStore(name=USER_PREF_NAME)

    val getUserSharedData: Flow<UserSharedPref> = context.dataStore.data.map { prefs ->
        val isLogin = prefs[PrefKeys.IS_LOGIN] ?: false
        val id = prefs[PrefKeys.ID].toString()
        val username = prefs[PrefKeys.USERNAME].toString()
        val level = prefs[PrefKeys.LEVEL] ?: 1
        val coin = prefs[PrefKeys.COIN] ?: 143
        val phone = prefs[PrefKeys.PHONE].toString()

        UserSharedPref(
            isLogin = isLogin,
            id = id,
            username = username,
            level = level,
            coin = coin,
            phone = phone
        )
    }

    suspend fun setUserData(user: UserSharedPref) {
        context.dataStore.edit { prefs -> prefs[PrefKeys.IS_LOGIN] = user.isLogin }
        context.dataStore.edit { prefs -> prefs[PrefKeys.ID] = user.id }
        context.dataStore.edit { prefs -> prefs[PrefKeys.USERNAME] = user.username }
        context.dataStore.edit { prefs -> prefs[PrefKeys.PHONE] = user.phone }
        context.dataStore.edit { prefs -> prefs[PrefKeys.LEVEL] = user.level }
        context.dataStore.edit { prefs -> prefs[PrefKeys.COIN] = user.coin }
    }


    private object PrefKeys {
        val IS_LOGIN = booleanPreferencesKey("isLogin")
        val ID = stringPreferencesKey("id")
        val USERNAME = stringPreferencesKey("username")
        val LEVEL = intPreferencesKey("level")
        val COIN = intPreferencesKey("coin")
        val PHONE = stringPreferencesKey("phone")
    }
}