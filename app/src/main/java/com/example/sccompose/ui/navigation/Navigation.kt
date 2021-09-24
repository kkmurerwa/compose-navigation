package com.example.sccompose.ui.navigation

import androidx.compose.runtime.*
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.sccompose.ui.fragments.DetailsScreen
import com.example.sccompose.ui.fragments.MainScreen
import com.example.sccompose.ui.routes.Routes

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.MainScreen.route
    ) {
        composable(
            route = Routes.MainScreen.route
        ) {
            MainScreen(navController = navController)
        }
        composable(
            route = Routes.DetailsScreen.route +"/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "Kenneth"
                }
            )
        ) { entry ->
            DetailsScreen(name = entry.arguments?.getString("name"))
        }
    }
}