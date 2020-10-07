package com.example.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var navController: NavController
    private lateinit var profileGraph: View
    private lateinit var notificationGraph: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)
        navController = Navigation.findNavController(this, R.id.navHostProfileFragment)
        profileGraph = findViewById(R.id.navHostProfileFragment)
        notificationGraph = findViewById(R.id.navHostNotificationFragment)

        notificationGraph.visibility = View.GONE

        navigationView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.profile -> {
                    navController = Navigation.findNavController(this, R.id.navHostProfileFragment)
                    profileGraph.visibility = View.VISIBLE
                    notificationGraph.visibility = View.GONE
                    drawerLayout.close()
                    true
                }

                R.id.notification -> {
                    navController =
                        Navigation.findNavController(this, R.id.navHostNotificationFragment)
                    profileGraph.visibility = View.GONE
                    notificationGraph.visibility = View.VISIBLE
                    drawerLayout.close()
                    true
                }
                R.id.inbox -> {
                    Toast.makeText(applicationContext, "inbox", Toast.LENGTH_SHORT).show()
                    drawerLayout.close()

                    true
                }
                R.id.collection -> {
                    Toast.makeText(applicationContext, "collection", Toast.LENGTH_SHORT).show()
                    drawerLayout.close()
                    true
                }
                R.id.setting -> {
                    Toast.makeText(applicationContext, "setting", Toast.LENGTH_SHORT).show()
                    drawerLayout.close()
                    true
                }
                R.id.history -> {
                    Toast.makeText(applicationContext, "history", Toast.LENGTH_SHORT).show()
                    drawerLayout.close()
                    true
                }
                R.id.support -> {
                    Toast.makeText(applicationContext, "support", Toast.LENGTH_SHORT).show()
                    drawerLayout.close()
                    true
                }
                R.id.about -> {
                    Toast.makeText(applicationContext, "about us", Toast.LENGTH_SHORT).show()
                    drawerLayout.close()
                    true
                }
                R.id.contact -> {
                    Toast.makeText(applicationContext, "contact with us", Toast.LENGTH_SHORT).show()
                    drawerLayout.close()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    override fun onBackPressed() {
        if (!navController.navigateUp()) {
            super.onBackPressed()
        }
    }

}