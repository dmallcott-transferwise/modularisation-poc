package com.transferwise.feature_one

import com.transferwise.feature_one.ui.FeatureOnePresenter
import dagger.Module
import dagger.Provides
import org.mockito.Mockito.mock
import javax.inject.Singleton

@Module
class FeatureOneModule {

    @Provides
    @Singleton
    fun providePresenter() : FeatureOnePresenter {
        return mock(FeatureOnePresenter::class.java)
    }
}