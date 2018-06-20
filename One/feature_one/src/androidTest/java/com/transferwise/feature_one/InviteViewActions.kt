package com.transferwise.feature_one

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.RootMatchers.withDecorView
import android.support.test.espresso.matcher.ViewMatchers.*
import android.view.View
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.not


object InviteViewActions {
    fun checkToastIsDisplayed(decorView: View, errorMessage: String) {
        // decorView is needed since it's a Toast
        onView(withText(errorMessage))
                .inRoot(withDecorView(not(`is`(decorView))))
                .check(matches(isDisplayed()))
    }

    fun clickApiCall() {
        onView(withId(R.id.apiCall)).perform(click())
    }
}