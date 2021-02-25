package io.github.manuelernesto.puppyadoption

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ComposeNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "welcome_screen"
    ) {
        composable("welcome_screen") {
            Welcome(navController)
        }
        composable("home_screen") {
            HomeScreen(navController)

        }
        composable("detail_screen/{puppy}") {
            DetailScreen(navController, it.arguments?.getString("puppy"))
        }

    }
}