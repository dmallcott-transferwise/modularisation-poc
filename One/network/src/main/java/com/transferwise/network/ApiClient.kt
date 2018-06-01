package com.transferwise.network

import com.transferwise.network.response.FeatureOneResponse
import com.transferwise.network.response.FeatureThreeResponse
import com.transferwise.network.response.FeatureTwoResponse

interface ApiClient {

    fun featureOne(): FeatureOneResponse

    fun featureTwo(): FeatureTwoResponse

    fun featureThree(): FeatureThreeResponse
}
