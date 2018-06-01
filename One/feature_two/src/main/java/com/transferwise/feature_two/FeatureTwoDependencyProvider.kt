package com.transferwise.feature_two

import com.transferwise.network.ApiClient

interface FeatureTwoDependencyProvider {

    fun provide() : ApiClient
}