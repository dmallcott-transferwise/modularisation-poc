package com.transferwise.one

import android.app.Application
import com.transferwise.feature_one.FeatureOneComponent
import com.transferwise.feature_one.FeatureOneDependencyProvider
import com.transferwise.feature_two.FeatureTwoContract
import com.transferwise.network.ApiClient

class OneApplication : Application(), FeatureOneDependencyProvider, FeatureTwoContract.FeatureTwoDependencyProvider {
    private val client = ApiClientImpl()

    private val component = DaggerAppComponent.builder().build()

    override fun createFeatureOneComponent(): FeatureOneComponent {
        return component.one().build()
    }

    // It's the App's class responsibility to satisfy other module dependencies.
    override fun provide(): ApiClient = client
}