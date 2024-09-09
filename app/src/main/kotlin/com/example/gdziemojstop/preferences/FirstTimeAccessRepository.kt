package com.example.gdziemojstop.preferences

import kotlinx.coroutines.flow.Flow


interface FirstTimeAccessRepository {

    val isFirstTimeAccess: Flow<Boolean>

    suspend fun setFirstTimeAccess()
}
