package com.transferwise.one

import com.transferwise.feature_one.FeatureOneComponent
import com.transferwise.feature_one.ScopeOne
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {
    fun one() : FeatureOneComponent.Builder
}