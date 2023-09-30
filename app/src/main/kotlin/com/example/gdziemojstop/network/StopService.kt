package com.example.gdziemojstop.network

import com.example.gdziemojstop.model.Stop
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface StopService {

    @GET("stops")
    suspend fun getStops(): Stop
}