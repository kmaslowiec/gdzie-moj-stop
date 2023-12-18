package com.example.gdziemojstop.stops.repository

import com.example.gdziemojstop.api.NetworkResult
import com.example.gdziemojstop.api.StopApi
import com.example.gdziemojstop.api.handleApi
import com.example.gdziemojstop.stops.model.Stop
import javax.inject.Inject

class StopRepository @Inject constructor(private val stopApi: StopApi) {
    suspend fun fetchStops(): NetworkResult<Stop> =
        handleApi { stopApi.getStops() }
}
