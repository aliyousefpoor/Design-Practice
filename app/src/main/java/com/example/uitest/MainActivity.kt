package com.example.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawerLayout)
        navigationView = findViewById(R.id.navigationView)

        navigationView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.profile -> {
                    Toast.makeText(applicationContext,"Profile", Toast.LENGTH_SHORT).show()
                    true
                }

                R.id.notification -> {
                    Toast.makeText(applicationContext,"notification", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.inbox -> {
                    Toast.makeText(applicationContext, "inbox", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.collection -> {
                    Toast.makeText(applicationContext, "collection", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
            drawerLayout.closeDrawer(Gravity.LEFT)
        } else {
            super.onBackPressed()
        }
    }

}