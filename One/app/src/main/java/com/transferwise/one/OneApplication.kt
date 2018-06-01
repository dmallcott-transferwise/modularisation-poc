package com.transferwise.one

import android.app.Application
import com.transferwise.feature_one.FeatureOneDependencyProvider
import com.transferwise.feature_two.FeatureTwoDependencyProvider
import com.transferwise.network.ApiClient

class OneApplication : Application(), FeatureOneDependencyProvider, FeatureTwoDependencyProvider {

    private val client = ApiClientImpl()

    // It's the App's class responsibility to satisfy other module dependencies.
    override fun provide(): ApiClient = client
}