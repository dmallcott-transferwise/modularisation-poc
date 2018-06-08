package com.transferwise.feature_one

class FeatureOneContract {

    interface DependencyProvider {

        fun createFeatureOneComponent() : FeatureOneComponent
    }

    object Navigator {

    }
}
