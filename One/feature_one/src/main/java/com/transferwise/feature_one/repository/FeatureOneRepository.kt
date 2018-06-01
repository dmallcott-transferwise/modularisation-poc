package com.transferwise.feature_one.repository

import com.transferwise.feature_one.domain.FeatureOne
import com.transferwise.feature_one.domain.FeatureOneMapper
import com.transferwise.network.ApiClient

class FeatureOneRepository(private val apiClient: ApiClient) {

    private val mapper: FeatureOneMapper = FeatureOneMapper()

    fun getFeatureOne(): FeatureOne? {
        // Pretend we're also getting from the cache
        return mapper.map(apiClient.featureOne())
    }
}