package com.example.cnmaya3

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Setup login button
        findViewById<MaterialButton>(R.id.login_button).setOnClickListener {
            // TODO: Add login validation
            startActivity(Intent(this, MainActivity::class.java))
            finishAffinity() // Close all previous activities
        }

        // Setup signup text
        findViewById<TextView>(R.id.signup_text).setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
            finish()
        }
    }
} 