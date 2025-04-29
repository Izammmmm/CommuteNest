package com.example.cnmaya3

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        // Setup login button
        findViewById<MaterialButton>(R.id.signInBtn).setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        // Setup signup button
        findViewById<MaterialButton>(R.id.signUpBtn).setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
} 