package com.transferwise.one

import com.transferwise.feature_one.FeatureOneComponent
import com.transferwise.feature_two.FeatureTwoComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(AppModule::class)])
interface AppComponent {
    fun one() : FeatureOneComponent.Builder
    fun two() : FeatureTwoComponent.Builder
}