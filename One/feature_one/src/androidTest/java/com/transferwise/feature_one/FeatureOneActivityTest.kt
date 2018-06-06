package com.transferwise.feature_one

import android.support.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class FeatureOneActivityTest {
    @Rule
    @JvmField
    val rule = ActivityTestRule(FeatureOneActivity::class.java, false, false)

    @Test
    fun name() {
        rule.launchActivity(null)
    }
}