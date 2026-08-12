package com.ammaryasser.athar.presentation.navigation

import kotlinx.serialization.Serializable


@Serializable
sealed interface NavRoute {

    @Serializable
    object SplashRoute : NavRoute

    @Serializable
    object MainRoute : NavRoute

}