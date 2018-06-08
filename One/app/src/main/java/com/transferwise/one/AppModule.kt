package com.transferwise.one

import com.transferwise.network.ApiClient
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideClient() : ApiClient = ApiClientImpl()
}