package com.transferwise.feature_one

import com.transferwise.network.ApiClient

interface FeatureOneDependencyProvider {

    fun provide() : ApiClient
}