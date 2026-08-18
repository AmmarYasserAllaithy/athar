package com.ammaryasser.athar.data.remote

import com.ammaryasser.athar.data.remote.model.GistResponse
import com.ammaryasser.athar.data.remote.model.VersionRaw
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.serialization.json.Json


class VersionApiService(
    private val client: HttpClient,
) {

    suspend fun fetchVersion(): VersionRaw {
        val response = client.get(GIST_URL).body<GistResponse>()
        val versionFileContent = response.files[VERSION_FILENAME]?.content
            ?: throw IllegalStateException("Version file not found")

        return Json.decodeFromString(VersionRaw.serializer(), versionFileContent)
    }

    companion object {
        private const val GIST_URL = "https://api.github.com/gists/490b4a961c33b25be5164fb1d028a4ef"
        private const val VERSION_FILENAME = "athar-version.json"
    }
}