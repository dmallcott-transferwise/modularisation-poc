package com.transferwise.feature_one

import android.support.test.InstrumentationRegistry.getInstrumentation
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import android.widget.Toast
import com.transferwise.feature_one.domain.FeatureOne
import com.transferwise.feature_one.ui.FeatureOneActivity
import com.transferwise.feature_one.ui.FeatureOnePresenter
import com.transferwise.feature_two.FeatureOneView
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito
import java.lang.RuntimeException
import javax.inject.Inject

@RunWith(AndroidJUnit4::class)
class FeatureOneActivityTest {

    @Rule
    @JvmField
    val rule = ActivityTestRule(FeatureOneActivity::class.java, false, false)

    @Inject
    lateinit var presenter: FeatureOnePresenter

    lateinit var app: UiTestApp
    lateinit var view: FeatureOneView

    @Before
    fun setUp() {
        app = getInstrumentation().targetContext.applicationContext as UiTestApp
        (app.createFeatureOneComponent() as DebugFeatureOneComponent).inject(this)
    }

    @Test
    fun name() {
        val response = "iOS sucks!"

        Mockito.`when`(presenter.getFeatureOne()).then {
            view.showSuccess(FeatureOne(response))
        }

        rule.launchActivity(null).also {
            view = it
        }

        InviteViewActions.clickApiCall()
        InviteViewActions.checkToastIsDisplayed(rule.activity.window.decorView, response)

        Thread.sleep(4000) // Hardcoded thread sleep because Toasts are annoying to Ui test
    }
}