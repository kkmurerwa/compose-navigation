package com.example.sccompose.ui.routes

sealed class Routes (val route: String) {
    object MainScreen: Routes("main_screen")
    object DetailsScreen: Routes("details_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}