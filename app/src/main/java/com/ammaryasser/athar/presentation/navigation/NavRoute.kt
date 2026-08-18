package com.ammaryasser.athar.presentation.navigation

import kotlinx.serialization.Serializable


@Serializable
sealed interface NavRoute {

    @Serializable
    data object SplashRoute : NavRoute

    @Serializable
    data class ForceUpdateRoute(
        val title: String? = null,
        val subtitle: String? = null,
    ) : NavRoute

    @Serializable
    data object MainRoute : NavRoute

}