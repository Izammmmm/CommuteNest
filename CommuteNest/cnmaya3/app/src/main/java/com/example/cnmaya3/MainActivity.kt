package com.example.cnmaya3

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        // Initialize bottom navigation
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val homeContent = findViewById<View>(R.id.home_content)

        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    // Show home content, hide any fragments
                    homeContent.visibility = View.VISIBLE
                    supportFragmentManager.findFragmentById(R.id.fragment_container)?.let {
                        supportFragmentManager.beginTransaction().remove(it).commit()
                    }
                    true
                }
                R.id.navigation_explore -> {
                    // TODO: Show explore fragment
                    homeContent.visibility = View.GONE
                    true
                }
                R.id.navigation_station -> {
                    // TODO: Show station fragment
                    homeContent.visibility = View.GONE
                    true
                }
                R.id.navigation_profile -> {
                    // Show profile fragment
                    homeContent.visibility = View.GONE
                    replaceFragment(ProfileFragment.newInstance())
                    true
                }
                else -> false
            }
        }

        // Set home as default selected item
        bottomNav.selectedItemId = R.id.navigation_home
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}