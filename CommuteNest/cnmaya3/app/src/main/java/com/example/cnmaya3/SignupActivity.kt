package com.example.cnmaya3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Setup signup button
        findViewById<MaterialButton>(R.id.signup_button).setOnClickListener {
            // TODO: Add signup validation
            startActivity(Intent(this, MainActivity::class.java))
            finishAffinity() // Close all previous activities
        }

        // Setup login text
        findViewById<TextView>(R.id.login_text).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
} 