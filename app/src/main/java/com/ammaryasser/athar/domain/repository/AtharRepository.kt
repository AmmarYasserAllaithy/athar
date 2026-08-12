package com.ammaryasser.athar.domain.repository

import com.ammaryasser.athar.domain.model.AtharModel


interface AtharRepository {

    suspend fun upsert(athar: AtharModel)

    suspend fun getAll(): List<AtharModel>

    suspend fun getById(id: Int): AtharModel

    suspend fun deleteById(id: Int)

}