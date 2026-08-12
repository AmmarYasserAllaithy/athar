package com.ammaryasser.athar.domain.usecase

import com.ammaryasser.athar.domain.model.AtharModel
import com.ammaryasser.athar.domain.repository.AtharRepository


class UpsertUseCase(private val repository: AtharRepository) {
    suspend operator fun invoke(athar: AtharModel) = repository.upsert(athar)
}