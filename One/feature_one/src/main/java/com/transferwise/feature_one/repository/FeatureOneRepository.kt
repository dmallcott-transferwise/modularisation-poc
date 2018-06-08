package com.transferwise.feature_one.repository

import com.transferwise.feature_one.FeatureOneApiClient
import com.transferwise.feature_one.domain.FeatureOne
import com.transferwise.feature_one.domain.FeatureOneMapper
import javax.inject.Inject
import javax.inject.Singleton

class FeatureOneRepository @Inject constructor(private val apiClient: FeatureOneApiClient) {

    private val mapper: FeatureOneMapper = FeatureOneMapper()

    fun getFeatureOne(): FeatureOne? {
        // Pretend we're also getting from the cache
        return mapper.map(apiClient.getFeatureOne())
    }
}