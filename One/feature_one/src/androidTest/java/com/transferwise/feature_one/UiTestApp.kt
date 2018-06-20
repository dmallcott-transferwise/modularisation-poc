package com.transferwise.feature_one

import android.app.Application
import com.transferwise.network.ApiClient
import org.mockito.Mockito.mock

class UiTestApp : Application(), FeatureOneContract.DependencyProvider {

    private val component = DaggerDebugFeatureOneComponent.create()!!

    override fun createFeatureOneComponent(): FeatureOneComponent {
        return component
    }
}