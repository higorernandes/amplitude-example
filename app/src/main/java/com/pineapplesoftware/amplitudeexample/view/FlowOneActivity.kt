package com.pineapplesoftware.amplitudeexample.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import com.pineapplesoftware.amplitudeexample.R
import com.pineapplesoftware.amplitudeexample.base.BaseActivity

/**
 * Created by higor on 20/05/18.
 */
class FlowOneActivity : BaseActivity() {

    companion object {
        fun getIntent(context: Context) : Intent {
            return Intent(context, FlowOneActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flow_one)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
    }

    override fun getEventName(): String? {
        return "Flow One"
    }

    override fun getScreenName(): String? {
        return "First flow screen"
    }

}
