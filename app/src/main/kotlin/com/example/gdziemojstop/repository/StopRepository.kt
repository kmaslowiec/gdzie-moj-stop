package com.example.gdziemojstop.repository

import com.example.gdziemojstop.model.Stop
import com.example.gdziemojstop.network.NetworkResult
import com.example.gdziemojstop.network.StopService
import com.example.gdziemojstop.network.handleApi
import javax.inject.Inject

class StopRepository @Inject constructor(private val stopService: StopService) {
    suspend fun fetchStops(): NetworkResult<Stop> =
        handleApi { stopService.getStops() }
}
