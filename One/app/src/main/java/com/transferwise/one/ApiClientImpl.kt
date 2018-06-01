package com.transferwise.one

import com.transferwise.network.ApiClient
import com.transferwise.network.response.FeatureOneResponse
import com.transferwise.network.response.FeatureThreeResponse
import com.transferwise.network.response.FeatureTwoResponse

class ApiClientImpl : ApiClient {
    override fun featureThree(): FeatureThreeResponse {
        return FeatureThreeResponse()
    }

    override fun featureOne(): FeatureOneResponse {
        return FeatureOneResponse()
    }

    override fun featureTwo(): FeatureTwoResponse {
        return FeatureTwoResponse()
    }
}