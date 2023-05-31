package com.stonewater.daggerhiltcourse.di

import com.stonewater.daggerhiltcourse.data.remote.DummyRepositoryImpl
import com.stonewater.daggerhiltcourse.domain.repository.DummyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    /**
     * Injects the repository implementation (which also injects the Api)
     * */
    @Binds
    @Singleton
    abstract fun bindDummyRepository(
        dummyRepositoryImpl: DummyRepositoryImpl
    ): DummyRepository
}