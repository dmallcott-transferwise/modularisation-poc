package com.transferwise.one

import android.app.Application
import com.transferwise.feature_one.FeatureOneComponent
import com.transferwise.feature_one.FeatureOneDependencyProvider
import com.transferwise.feature_two.FeatureTwoComponent
import com.transferwise.feature_two.FeatureTwoContract
import com.transferwise.network.ApiClient

class OneApplication : Application(), FeatureOneDependencyProvider, FeatureTwoContract.DependencyProvider {

    private val component : AppComponent = DaggerAppComponent.builder().build()

    override fun createFeatureOneComponent(): FeatureOneComponent = component.one().build()

    override fun createTwoComponent(): FeatureTwoComponent = component.two().build()
}