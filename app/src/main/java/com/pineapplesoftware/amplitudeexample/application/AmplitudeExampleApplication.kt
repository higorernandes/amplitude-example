package com.pineapplesoftware.amplitudeexample.application

import android.app.Application
import com.pineapplesoftware.amplitudeexample.BuildConfig
import com.pineapplesoftware.amplitudeexample.analytics.AnalyticsManager

/**
 * Created by higor on 20/05/18.
 */
class AmplitudeExampleApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        // Verifies if the current configuration is not DEBUG, then initializes Amplitude. This prevents
        // events from being logged onto Amplitude which don't correspond to acual user activity.
        if (!BuildConfig.DEBUG) {
            AnalyticsManager.initializeAnalyticsTools(this)
        }

        // TODO: Remove when testing other stuff.
        AnalyticsManager.initializeAnalyticsTools(this)
    }

}