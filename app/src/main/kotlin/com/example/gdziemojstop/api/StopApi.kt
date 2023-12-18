package com.example.gdziemojstop.api

import com.example.gdziemojstop.stops.model.Stop
import retrofit2.Response
import retrofit2.http.GET
import javax.inject.Singleton

@Singleton
interface StopApi {

    @GET("stops")
    suspend fun getStops(): Response<Stop>
}
