package com.itw.navigationcompose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.itw.navigationcompose.auth.LoginScreen
import com.itw.navigationcompose.home.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
data class HomeRoute(val username: String)

@Serializable
object LoginRoute

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = LoginRoute
    ) {
        composable<LoginRoute> {
            LoginScreen { username ->
                navController.navigate(
                    HomeRoute(username = username)
                )
            }
        }
        composable<HomeRoute> { backStackEntry ->
            val route: HomeRoute = backStackEntry.toRoute()
            HomeScreen(username = route.username) {
                navController.popBackStack()
            }
        }
    }
}