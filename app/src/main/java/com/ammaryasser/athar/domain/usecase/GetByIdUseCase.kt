package com.ammaryasser.athar.domain.usecase

import com.ammaryasser.athar.domain.repository.AtharRepository


class GetByIdUseCase(private val repository: AtharRepository) {
    suspend operator fun invoke(id: Int) = repository.getById(id)
}