package com.example.gdziemojstop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gdziemojstop.stops.screen.StopScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.StopScreen.name,
    ) {
        composable(route = AppScreens.StopScreen.name) {
            StopScreen(navController = navController)
        }
    }
}
