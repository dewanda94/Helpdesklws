package com.dewanda.helloword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_start)

        Handler().postDelayed({
            finish()
            startActivity(Intent (this,HomeActivity::class.java))
            //Do something after 100ms
            }, 1000)
        }
    }
