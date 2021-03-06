package com.transferwise.feature_two

import android.content.Context
import android.content.Intent
import com.transferwise.feature_two.ui.FeatureTwoActivity
import com.transferwise.network.ApiClient

class FeatureTwoContract {

    interface DependencyProvider {

        fun createTwoComponent() : FeatureTwoComponent
    }

    object Navigator {
        // TODO : this is better through implicit intents
        fun startFeatureTwo(context: Context) {
            context.startActivity(Intent(context, FeatureTwoActivity::class.java))
        }
    }
}