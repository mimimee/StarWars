package com.itsnotme.catwiki.di

import com.itsnotme.catwiki.data.fact.cache.FactCacheDataSource
import com.itsnotme.catwiki.data.fact.cache.FactCacheDataSourceImpl
import com.itsnotme.catwiki.data.fact.cloud.FactCloudDataSource
import com.itsnotme.catwiki.data.fact.cloud.FactCloudDataSourceImpl
import com.itsnotme.catwiki.data.fact.repository.FactRepositoryImpl
import com.itsnotme.catwiki.domain.repository.FactRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Singleton
    @Binds
    abstract fun provideRepository(repository: FactRepositoryImpl): FactRepository

    @Singleton
    @Binds
    abstract fun provideCloudDataSource(cloudDataSource: FactCloudDataSourceImpl): FactCloudDataSource

    @Singleton
    @Binds
    abstract fun provideCacheDataSource(cacheDataSource: FactCacheDataSourceImpl): FactCacheDataSource
}