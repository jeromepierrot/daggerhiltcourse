package com.stonewater.daggerhiltcourse.di

import android.app.Application
import com.stonewater.daggerhiltcourse.data.remote.DummyApi
import com.stonewater.daggerhiltcourse.data.remote.DummyRepositoryImpl
import com.stonewater.daggerhiltcourse.domain.repository.DummyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    /**
     * Injects the Api
     * */
    @Provides
    @Singleton
    fun provideDummyApi(): DummyApi {
        return Retrofit.Builder()
            .baseUrl("https://test.com")
            .build()
            .create(DummyApi::class.java)
    }

    /**
     * Injects the repository implementation (which also injects the Api)
     * */
    @Provides
    @Singleton
    fun provideDummyRepository(
        api: DummyApi,
        app: Application,
        @Named("hello1") hello: String
    ): DummyRepository {
        return DummyRepositoryImpl(api, app)
    }

    @Provides
    @Singleton
    @Named("hello1")
    fun provideString1() = "Hello 1"

    @Provides
    @Singleton
    @Named("hello2")
    fun provideString2() = "Hello 2"
}