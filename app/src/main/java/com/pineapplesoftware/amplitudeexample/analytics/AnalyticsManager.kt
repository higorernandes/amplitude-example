package com.pineapplesoftware.amplitudeexample.analytics

import android.app.Application
import com.amplitude.api.Amplitude
import com.pineapplesoftware.amplitudeexample.BuildConfig
import org.json.JSONObject

/**
 * Created by Higor on 20/05/18.
 */
class AnalyticsManager {

    companion object {

        private val AMPLITUDE_API_KEY : String = "c113737215fd970db73b4333636b42d9"

        /**
         * Initializes the analytics tools.
         */
        fun initializeAnalyticsTools(application: Application) {
            initializeAmplitude(application)
            // You can put any other initialization tool here too (like Firebase, Mixpanel, Appsee, etc.).
        }

        /**
         * Initializes Amplitude.
         */
        private fun initializeAmplitude(application: Application) {
            Amplitude.getInstance().initialize(application.applicationContext, AMPLITUDE_API_KEY).enableForegroundTracking(application)
        }

        /**
         * Logs a screen visualization event to Amplitude (or any other analytics tool you wish to add).
         */
        fun logScreenViewEvent(eventName: String?, screenName: String?, screenTime: Long?) {
            if (eventName != null) { //&& !BuildConfig.DEBUG) {

                // Putting properties into event.
                val eventProperties = JSONObject()
                eventProperties.put("screen_name", screenName)
                eventProperties.put("screen_time", screenTime)

                // Logging the event to Amplitude.
                Amplitude.getInstance().logEvent(eventName, eventProperties)
            }
        }

    }

}