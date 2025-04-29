package com.example.cnmaya3

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class ActivityHomepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.cnmaya3.R.layout.activity_homepage)

        val bottomNav = findViewById<BottomNavigationView>(com.example.cnmaya3.R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener { item: MenuItem ->
            val itemId = item.itemId
            if (itemId == com.example.cnmaya3.R.id.navigation_home) {
                // Handle home navigation
                return@setOnItemSelectedListener true
            } else if (itemId == com.example.cnmaya3.R.id.navigation_explore) {
                // Handle explore navigation
                return@setOnItemSelectedListener true
            } else if (itemId == com.example.cnmaya3.R.id.navigation_station) {
                // Handle bookmarks navigation
                return@setOnItemSelectedListener true
            } else if (itemId == com.example.cnmaya3.R.id.navigation_profile) {
                // Handle profile navigation
                return@setOnItemSelectedListener true
            }
            false
        }
    }
}