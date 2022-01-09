package com.jedun.retirementcalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        AppCenter.start(application, "0ed4e4b7-bf72-41d9-8e65-8c45b47afc2a", Analytics::class.java, Crashes::class.java)
    }
}