package com.ammaryasser.athar.presentation.screen.splash

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ammaryasser.athar.BuildConfig
import com.ammaryasser.athar.domain.repository.VersionRepository
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch


class SplashViewModel(
    private val versionRepo: VersionRepository
) : ViewModel() {

    private val _effects = MutableSharedFlow<SplashContract.Effect>()
    val events = _effects.asSharedFlow()


    init {
        checkVersion()
    }


    private fun checkVersion() {
        viewModelScope.launch {
            versionRepo.getVersionInfo()
                .onSuccess { info ->
                    if (isUpdateRequired(info.minSupportedVersion)) {
                        _effects.emit(SplashContract.Effect.NavigateToForceUpdate(info))
                    } else {
                        _effects.emit(SplashContract.Effect.NavigateToMain)
                    }
                }
                .onFailure {
                    // handle offline mode
                    _effects.emit(SplashContract.Effect.NavigateToMain)
                }
        }
    }

    private fun isUpdateRequired(minVersion: String): Boolean {
        val currentVersion = BuildConfig.VERSION_NAME

        return currentVersion < minVersion // TODO: Compare versions using semver .split
    }

}

