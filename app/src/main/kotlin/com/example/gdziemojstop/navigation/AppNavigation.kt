package com.example.gdziemojstop.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.gdziemojstop.screen.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = AppScreens.HomeScreen.name,
    ) {
        composable(route = AppScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        /* composable(
             route = MovieScreens.DetailsScreen.name + "/{movieId}",
             arguments = listOf(navArgument(name = "movieId") { type = NavType.StringType })
         ) { backStackEntry ->
             DetailsScreen(navController = navController, backStackEntry.arguments?.getString("movieId"))
         }*/
    }
}