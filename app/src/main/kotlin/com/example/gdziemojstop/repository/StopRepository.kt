package com.example.gdziemojstop.repository

import com.example.gdziemojstop.network.StopService
import javax.inject.Inject

class StopRepository @Inject constructor(private val stopService: StopService) {

    suspend fun getSops() =
        stopService.getStops()

}