package com.transferwise.feature_two.domain

import com.transferwise.network.response.FeatureTwoResponse

class FeatureTwoMapper {

    fun map(featureTwoResponse: FeatureTwoResponse) : FeatureTwo {
        return FeatureTwo(featureTwoResponse.data)
    }
}