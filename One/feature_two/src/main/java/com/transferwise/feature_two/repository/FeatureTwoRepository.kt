package com.transferwise.feature_two.repository

import com.transferwise.feature_two.domain.FeatureTwo
import com.transferwise.feature_two.domain.FeatureTwoMapper
import com.transferwise.network.ApiClient
import javax.inject.Inject

class FeatureTwoRepository @Inject constructor(private val apiClient: ApiClient) {

    private val mapper: FeatureTwoMapper = FeatureTwoMapper()

    fun getFeatureTwo(): FeatureTwo? {
        // Pretend we're also getting from the cache
        return mapper.map(apiClient.featureTwo())
    }
}