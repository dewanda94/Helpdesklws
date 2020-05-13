package com.dewanda.helloword

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        btn_login.setOnClickListener {
            startActivity(Intent(this, HomeActivity::class.java))
            overridePendingTransition(
                R.anim.slide_in,
                R.anim.slide_in_out
            )
            finish()
        }

        tv_signup.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
            overridePendingTransition(
                R.anim.slide_in,
                R.anim.slide_in_out
            )
        }
    }
}
