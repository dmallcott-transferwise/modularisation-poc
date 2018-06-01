package com.transferwise.feature_two

import com.transferwise.feature_one.domain.FeatureOne

interface FeatureOneView {

    fun showSuccess(feature: FeatureOne)

    fun showError()
}