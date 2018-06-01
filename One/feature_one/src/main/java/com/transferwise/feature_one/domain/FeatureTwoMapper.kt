package com.transferwise.feature_one.domain

import com.transferwise.network.response.FeatureOneResponse

class FeatureOneMapper {

    fun map(featureResponse: FeatureOneResponse) : FeatureOne {
        return FeatureOne(featureResponse.data)
    }
}