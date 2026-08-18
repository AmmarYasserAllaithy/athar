package com.ammaryasser.athar.domain.repository

import com.ammaryasser.athar.domain.model.DocModel
import com.ammaryasser.athar.util.Resource
import kotlinx.coroutines.flow.Flow


interface DocsRepository {

    suspend fun upsert(athar: DocModel)

    fun getAll(): Flow<Resource<List<DocModel>>>

    fun getById(id: Int): Flow<Resource<DocModel?>>

    suspend fun deleteById(id: Int)

}