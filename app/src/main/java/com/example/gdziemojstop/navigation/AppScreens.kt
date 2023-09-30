package com.example.gdziemojstop.navigation

enum class AppScreens {
    HomeScreen;

    companion object {
        fun fromRoute(route: String?): AppScreens =
            when (route?.substringBefore("/")) {
                HomeScreen.name -> HomeScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("Roure $route is not recognize")
            }
    }
}