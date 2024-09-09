package com.example.gdziemojstop.preferences

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject


val FIRST_TIME_ACCESS_KEY = booleanPreferencesKey("first_time_access")

class FirstTimeAccessRepositoryImpl @Inject constructor(private val dataStore: DataStore<Preferences>) : FirstTimeAccessRepository {

    override val isFirstTimeAccess: Flow<Boolean> = dataStore.data
        .map { preferences ->
            preferences[FIRST_TIME_ACCESS_KEY] ?: true
        }


    override suspend fun setFirstTimeAccess() {
        dataStore.edit { preferences ->
            preferences[FIRST_TIME_ACCESS_KEY] = false
        }
    }
}
