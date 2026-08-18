package com.ammaryasser.athar.presentation.screen.splash

import com.ammaryasser.athar.domain.model.VersionModel


object SplashContract {

    sealed interface Effect {
        data object NavigateToMain : Effect
        data class NavigateToForceUpdate(val versionInfo: VersionModel) : Effect
    }

}