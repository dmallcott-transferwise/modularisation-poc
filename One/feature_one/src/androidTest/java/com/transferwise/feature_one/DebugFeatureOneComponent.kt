package com.transferwise.feature_one

import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [FeatureOneModule::class])
interface DebugFeatureOneComponent : FeatureOneComponent {
    fun inject(featureOneActivityTest: FeatureOneActivityTest)
}