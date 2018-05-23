package com.pineapplesoftware.amplitudeexample.view

import android.os.Bundle
import android.view.WindowManager
import com.pineapplesoftware.amplitudeexample.R
import com.pineapplesoftware.amplitudeexample.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)

        mainScreenButton.setOnClickListener { startActivity(SecondActivity.getIntent(this)) }
    }

    override fun getEventName(): String? {
        return "Main"
    }

    override fun getScreenName(): String? {
        return "Welcome screen"
    }

}
