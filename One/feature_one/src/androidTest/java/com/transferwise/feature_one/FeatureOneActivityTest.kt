package com.transferwise.feature_one

import android.support.test.InstrumentationRegistry.getInstrumentation
import android.support.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import com.transferwise.feature_one.ui.FeatureOneActivity
import com.transferwise.network.response.FeatureOneResponse


class FeatureOneActivityTest {

    @Rule
    @JvmField
    val rule = ActivityTestRule(FeatureOneActivity::class.java, false, false)

    lateinit var app: UiTestApp

    @Before
    fun setUp() {
        app = getInstrumentation().targetContext.applicationContext as UiTestApp
    }

    @Test
    fun name() {
        val response = "iOS sucks!"
        Mockito.`when`(app.provide().featureOne()).thenReturn(FeatureOneResponse(response))

        rule.launchActivity(null)

        InviteViewActions.clickApiCall()
        InviteViewActions.checkToastIsDisplayed(rule.activity.window.decorView, response)

        Thread.sleep(3000)
    }
}