package com.transferwise.one

import android.app.Application
import com.transferwise.feature_one.FeatureOneComponent
import com.transferwise.feature_one.FeatureOneContract
import com.transferwise.feature_two.FeatureTwoComponent
import com.transferwise.feature_two.FeatureTwoContract
import com.transferwise.network.ApiClient

class OneApplication : Application(), FeatureOneContract.DependencyProvider, FeatureTwoContract.DependencyProvider {

    private val component : AppComponent = DaggerAppComponent.builder().build()

    override fun createFeatureOneComponent(): FeatureOneComponent = component.one().build()

    override fun createTwoComponent(): FeatureTwoComponent = component.two().build()
}