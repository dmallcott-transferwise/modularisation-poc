package com.transferwise.feature_one

import com.transferwise.network.response.FeatureOneResponse
import javax.inject.Inject
import javax.inject.Singleton

class FeatureOneApiClient @Inject constructor() {
    fun getFeatureOne(): FeatureOneResponse {
        return FeatureOneResponse("Hey there. I'm feature one.")
    }
}