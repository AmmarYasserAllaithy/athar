package com.ammaryasser.athar.data.mappers

import com.ammaryasser.athar.data.remote.model.VersionRaw
import com.ammaryasser.athar.domain.model.VersionModel


fun VersionRaw.toModel() = VersionModel(
    latestVersion = latestVersion,
    minSupportedVersion = minSupportedVersion,
    maintenanceMode = maintenanceMode,
    forceUpdateTitle = null, // forceUpdateTitle,
    forceUpdateSubtitle = null, // forceUpdateSubtitle,
)
