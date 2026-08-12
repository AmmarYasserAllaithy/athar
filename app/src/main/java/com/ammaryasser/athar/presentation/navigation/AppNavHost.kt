package com.ammaryasser.athar.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ammaryasser.athar.presentation.screen.SplashScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = NavRoute.SplashRoute,
        modifier = modifier,
    ) {

        composable<NavRoute.SplashRoute> {
            SplashScreen {
                navController.navigate(NavRoute.MainRoute) {
                    popUpTo<NavRoute.SplashRoute> {
                        inclusive = true
                    }
                }
            }
        }

    }
}