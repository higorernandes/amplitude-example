package com.pineapplesoftware.amplitudeexample.base

import android.support.v7.app.AppCompatActivity
import com.pineapplesoftware.amplitudeexample.analytics.AnalyticsManager

/**
 * Created by higor on 20/05/18.
 */
open class BaseActivity : AppCompatActivity() {

    private var startTime = Long.MAX_VALUE

    override fun onResume() {
        super.onResume()
        startTime = System.currentTimeMillis()
    }

    override fun onPause() {
        super.onPause()

        // Manually calculating the screen time.
        val screenViewTime = System.currentTimeMillis() - startTime
        AnalyticsManager.logScreenViewEvent(getEventName(), getScreenName(), screenViewTime)
    }

    // Returns the name of the event. Should be overwritten so child classes provide their respective event names.
    open fun getEventName() : String? {
        return null
    }

    // Returns the screen name for the screen view event. Should be overwritten so child classes provide their respective event names.
    open fun getScreenName() : String? {
        return null
    }
}