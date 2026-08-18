package com.ammaryasser.athar.data.repo

import com.ammaryasser.athar.data.mappers.toModel
import com.ammaryasser.athar.data.remote.VersionApiService
import com.ammaryasser.athar.domain.model.VersionModel
import com.ammaryasser.athar.domain.repository.VersionRepository


class VersionRepo(
    private val apiService: VersionApiService,
) : VersionRepository {

    override suspend fun getVersionInfo(): Result<VersionModel> =
        try {
            val info = apiService.fetchVersion()
            Result.success(info.toModel())
        } catch (e: Exception) {
            Result.failure(e)
        }

}