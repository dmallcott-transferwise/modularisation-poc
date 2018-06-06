package com.transferwise.feature_one

import android.app.Application
import com.transferwise.network.ApiClient
import org.mockito.Mockito.mock

class UiTestApp : Application(), FeatureOneDependencyProvider {
    override fun provide(): ApiClient {
        return mock(ApiClient::class.java)
    }
}