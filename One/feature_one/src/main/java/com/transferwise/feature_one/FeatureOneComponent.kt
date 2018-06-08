package com.transferwise.feature_one

import com.transferwise.feature_one.ui.FeatureOneActivity
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@Subcomponent
interface FeatureOneComponent {
    fun inject(activity: FeatureOneActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): FeatureOneComponent
    }
}
