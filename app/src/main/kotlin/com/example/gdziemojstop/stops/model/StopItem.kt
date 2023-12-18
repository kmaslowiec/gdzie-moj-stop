package com.example.gdziemojstop.stops.model

data class StopItem(
    val id: Int,
    val latitude: Double,
    val longitude: Double,
    val name: String,
    val number: String,
    val park_and_ride: Boolean,
    val request_stop: Boolean,
    val updated_at: String
)