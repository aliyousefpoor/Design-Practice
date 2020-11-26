package com.example.uitest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigation: BottomNavigationView
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var navigationView: NavigationView
    private lateinit var navController: NavController
    private lateinit var profileNavHost: View
    private lateinit var moreNavHost: View
    private lateinit var listNavHost: View
    private lateinit var inboxNavHost: View
    private lateinit var collectionNavHost: View
    private lateinit var menu: ImageView

    private lateinit var notificationGraph: View


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerLayout = findViewById(R.id.drawerLayout)
        bottomNavigation = findViewById(R.id.bottomNavigation)
        navigationView = findViewById(R.id.navigationView)
        navController = Navigation.findNavController(this, R.id.navHostProfileFragment)
        profileNavHost = findViewById(R.id.navHostProfileFragment)
        inboxNavHost = findViewById(R.id.navHostInboxFragment)
        collectionNavHost = findViewById(R.id.navHostCollectionFragment)
        moreNavHost = findViewById(R.id.navHostMoreFragment)
        listNavHost = findViewById(R.id.navHostListFragment)
        menu = findViewById(R.id.drawerMenu)

        notificationGraph = findViewById(R.id.navHostNotificationFragment)

        notificationGraph.visibility = View.GONE
        inboxNavHost.visibility = View.GONE
        collectionNavHost.visibility = View.GONE
        moreNavHost.visibility = View.GONE
        listNavHost.visibility = View.GONE
        bottomNavigation.selectedItemId = R.id.navHostProfileFragment

        menu.setOnClickListener {
            if (drawerLayout.isOpen) {
                drawerLayout.close()
            } else {
                drawerLayout.open()
            }
        }
        navigationView.setNavigationItemSelectedListener {

            when (it.itemId) {
                R.id.profile -> {
                    navController = Navigation.findNavController(this, R.id.navHostProfileFragment)
                    profileNavHost.visibility = View.VISIBLE
                    collectionNavHost.visibility = View.GONE
                    inboxNavHost.visibility = View.GONE
                    moreNavHost.visibility = View.GONE
                    listNavHost.visibility = View.GONE
                    notificationGraph.visibility = View.GONE
                    drawerLayout.close()
                    true
                }

                R.id.notification -> {
                    navController =
                        Navigation.findNavController(this, R.id.navHostNotificationFragment)
                    profileNavHost.visibility = View.GONE
                    collectionNavHost.visibility = View.GONE
                    inboxNavHost.visibility = View.GONE
                    moreNavHost.visibility = View.GONE
                    listNavHost.visibility = View.GONE
                    notificationGraph.visibility = View.VISIBLE
                    drawerLayout.close()
                    true
                }
                R.id.inbox -> {
                    navController = Navigation.findNavController(this, R.id.navHostInboxFragment)
                    profileNavHost.visibility = View.GONE
                    inboxNavHost.visibility = View.VISIBLE
                    collectionNavHost.visibility = View.GONE
                    moreNavHost.visibility = View.GONE
                    listNavHost.visibility = View.GONE
                    notificationGraph.visibility = View.GONE
                    drawerLayout.close()

                    true
                }
                R.id.collection -> {
                    navController =
                        Navigation.findNavController(this, R.id.navHostCollectionFragment)
                    collectionNavHost.visibility = View.VISIBLE
                    profileNavHost.visibility = View.GONE
                    inboxNavHost.visibility = View.GONE
                    moreNavHost.visibility = View.GONE
                    listNavHost.visibility = View.GONE
                    notificationGraph.visibility = View.GONE
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
        bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.moreFragment -> {
                    navController = Navigation.findNavController(this, R.id.navHostProfileFragment)
                    moreNavHost.visibility = View.VISIBLE
                    profileNavHost.visibility = View.GONE
                    listNavHost.visibility = View.GONE
                    inboxNavHost.visibility = View.GONE
                    collectionNavHost.visibility = View.GONE
                    notificationGraph.visibility = View.GONE
                    true
                }
                R.id.profileFragment -> {
                    navController = Navigation.findNavController(this, R.id.navHostProfileFragment)
                    profileNavHost.visibility = View.VISIBLE
                    moreNavHost.visibility = View.GONE
                    listNavHost.visibility = View.GONE
                    inboxNavHost.visibility = View.GONE
                    notificationGraph.visibility = View.GONE
                    collectionNavHost.visibility = View.GONE
                    true
                }
                R.id.listFragment -> {
                    navController = Navigation.findNavController(this, R.id.navHostProfileFragment)
                    listNavHost.visibility = View.VISIBLE
                    moreNavHost.visibility = View.GONE
                    profileNavHost.visibility = View.GONE
                    inboxNavHost.visibility = View.GONE
                    collectionNavHost.visibility = View.GONE
                    notificationGraph.visibility = View.GONE
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