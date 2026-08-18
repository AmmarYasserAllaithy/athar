package com.ammaryasser.athar.domain.repository

import com.ammaryasser.athar.domain.model.VersionModel


interface VersionRepository {

    suspend fun getVersionInfo(): Result<VersionModel>

}