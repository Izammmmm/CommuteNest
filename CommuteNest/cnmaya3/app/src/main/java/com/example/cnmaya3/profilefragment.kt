package com.example.cnmaya3

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class ProfileFragment : Fragment() {

    private lateinit var recentActivityRecyclerView: RecyclerView
    private lateinit var favoritesRecyclerView: RecyclerView
    private lateinit var logoutButton: MaterialButton

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize views
        recentActivityRecyclerView = view.findViewById(R.id.recent_activity_recycler)
        favoritesRecyclerView = view.findViewById(R.id.favorites_recycler)
        logoutButton = view.findViewById(R.id.logout_button)

        // Setup RecyclerViews
        setupRecentActivity()
        setupFavorites()

        // Setup logout button
        setupLogoutButton()

        // Setup click listeners
        view.findViewById<LinearLayout>(R.id.edit_personal_details).setOnClickListener {
            onEditPersonalDetailsClick()
        }

        view.findViewById<LinearLayout>(R.id.edit_company_details).setOnClickListener {
            onEditCompanyDetailsClick()
        }

        view.findViewById<LinearLayout>(R.id.edit_vehicle_details).setOnClickListener {
            onEditVehicleDetailsClick()
        }

        // Initialize click listeners
        view.findViewById<ImageButton>(R.id.edit_button).setOnClickListener {
            onEditProfileClick()
        }

        view.findViewById<LinearLayout>(R.id.profile_settings).setOnClickListener {
            onProfileSettingsClick()
        }

        view.findViewById<LinearLayout>(R.id.privacy_settings).setOnClickListener {
            onPrivacyClick()
        }

        view.findViewById<LinearLayout>(R.id.notification_settings).setOnClickListener {
            onNotificationsClick()
        }
    }

    private fun setupRecentActivity() {
        recentActivityRecyclerView.layoutManager = LinearLayoutManager(context)
        // TODO: Set adapter and load recent activity data
    }

    private fun setupFavorites() {
        favoritesRecyclerView.layoutManager = LinearLayoutManager(context)
        // TODO: Set adapter and load favorites data
    }

    private fun setupLogoutButton() {
        logoutButton.setOnClickListener {
            showLogoutConfirmationDialog()
        }
    }

    private fun showLogoutConfirmationDialog() {
        context?.let {
            MaterialAlertDialogBuilder(it)
                .setTitle("Logout")
                .setMessage("Are you sure you want to logout?")
                .setPositiveButton("Yes") { _, _ ->
                    performLogout()
                }
                .setNegativeButton("Cancel", null)
                .show()
        }
    }

    private fun performLogout() {
        // Start WelcomeActivity
        val intent = Intent(requireContext(), WelcomeActivity::class.java)
        // Clear all activities on top and start fresh
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        // This will finish the current activity
        requireActivity().finish()
    }

    private fun onEditProfileClick() {
        // TODO: Navigate to edit profile screen
    }

    private fun onProfileSettingsClick() {
        // TODO: Navigate to profile settings screen
    }

    private fun onPrivacyClick() {
        // TODO: Navigate to privacy settings screen
    }

    private fun onNotificationsClick() {
        // TODO: Navigate to notifications settings screen
    }

    private fun onEditPersonalDetailsClick() {
        // TODO: Navigate to edit personal details screen
    }

    private fun onEditCompanyDetailsClick() {
        // TODO: Navigate to edit company details screen
    }

    private fun onEditVehicleDetailsClick() {
        // TODO: Navigate to edit vehicle details screen
    }

    companion object {
        fun newInstance() = ProfileFragment()
    }
}