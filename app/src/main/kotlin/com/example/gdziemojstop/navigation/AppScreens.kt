package com.example.gdziemojstop.navigation

enum class AppScreens {
    StopScreen;

    companion object {
        fun fromRoute(route: String?): AppScreens =
            when (route?.substringBefore("/")) {
                StopScreen.name -> StopScreen
                null -> StopScreen
                else -> throw IllegalArgumentException("Roure $route is not recognize")
            }
    }
}