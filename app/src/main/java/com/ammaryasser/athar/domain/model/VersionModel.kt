package com.ammaryasser.athar.domain.model


data class VersionModel(
    val latestVersion: String,
    val minSupportedVersion: String,
    val maintenanceMode: Boolean,
    val forceUpdateTitle: String?,
    val forceUpdateSubtitle: String?,
)