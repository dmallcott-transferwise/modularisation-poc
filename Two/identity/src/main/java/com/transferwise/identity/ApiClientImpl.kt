package com.transferwise.identity

import com.transferwise.network.ApiClient
import com.transferwise.network.FeatureOneResponse
import com.transferwise.network.FeatureTwoResponse

class ApiClientImpl : ApiClient {
    override fun featureTwo(): FeatureTwoResponse {
        return FeatureTwoResponse()
    }

    override fun featureOne(): FeatureOneResponse {
        return FeatureOneResponse()
    }
}