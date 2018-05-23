package com.pineapplesoftware.amplitudeexample.view

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import com.pineapplesoftware.amplitudeexample.R
import com.pineapplesoftware.amplitudeexample.base.BaseActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {

    companion object {
        fun getIntent(context: Context) : Intent {
            return Intent(context, SecondActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        goToFlowOneButton.setOnClickListener { startActivity(FlowOneActivity.getIntent(this)) }
        goToFlowTwoButton.setOnClickListener { startActivity(FlowTwoActivity.getIntent(this)) }
    }

    override fun getEventName(): String? {
        return "Main"
    }

    override fun getScreenName(): String? {
        return "Second screen"
    }

}
