package com.example.firebaseanalyticstest

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class AnotherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_another)
    }

    fun setCurrentScreen(view: View) {
        Firebase.analytics.setCurrentScreen(this, "SetScreenScreenName", null)
    }

    fun logScreenView(view: View) {
        Firebase.analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW) {
            param(FirebaseAnalytics.Param.SCREEN_NAME, "LogEventScreenName")
            param(FirebaseAnalytics.Param.SCREEN_CLASS, "AnotherActivity")
        }
    }
}