package com.ammaryasser.athar.data.remote.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GistResponse(val files: Map<String, GistFileRaw>)

@Serializable
data class GistFileRaw(val content: String)

@Serializable
data class VersionRaw(
    @SerialName("latest_version") val latestVersion: String,
    @SerialName("min_supported_version") val minSupportedVersion: String,
    @SerialName("maintenance_mode") val maintenanceMode: Boolean,
    // @SerialName("force_update_title") val forceUpdateTitle: String?,
    // @SerialName("force_update_subtitle") val forceUpdateSubtitle: String?,
)
