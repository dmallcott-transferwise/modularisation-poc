package com.transferwise.feature_one

import android.app.Application
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner

class UiTestRunner : AndroidJUnitRunner() {
    override fun newApplication(cl: ClassLoader?, className: String?, context: Context?): Application {
        return super.newApplication(cl, UiTestApp::class.java.name, context)
    }
}