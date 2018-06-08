package com.transferwise.feature_two

import com.transferwise.feature_two.ui.FeatureTwoActivity
import dagger.Subcomponent

@Subcomponent
interface FeatureTwoComponent {
    fun inject(activity: FeatureTwoActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build(): FeatureTwoComponent
    }
}
