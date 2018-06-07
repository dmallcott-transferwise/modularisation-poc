package com.transferwise.feature_two.ui

import com.transferwise.feature_two.domain.FeatureTwo

internal interface FeatureTwoView {

    fun showSuccess(featureTwo: FeatureTwo)

    fun showError()
}