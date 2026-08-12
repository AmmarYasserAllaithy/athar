package com.ammaryasser.athar.di

import com.ammaryasser.athar.domain.usecase.DeleteByIdUseCase
import com.ammaryasser.athar.domain.usecase.GetAllUseCase
import com.ammaryasser.athar.domain.usecase.GetByIdUseCase
import com.ammaryasser.athar.domain.usecase.UpsertUseCase
import org.koin.dsl.module


val atharModule = module {

    // UseCases
    factory { UpsertUseCase(repository = get()) }
    factory { GetAllUseCase(repository = get()) }
    factory { GetByIdUseCase(repository = get()) }
    factory { DeleteByIdUseCase(repository = get()) }

}