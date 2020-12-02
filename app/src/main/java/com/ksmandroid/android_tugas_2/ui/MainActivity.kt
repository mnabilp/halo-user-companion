package com.ksmandroid.android_tugas_2.ui

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ksmandroid.android_tugas_2.R
import com.ksmandroid.android_tugas_2.views.HistoryFragment
import com.ksmandroid.android_tugas_2.views.HomeFragment
import com.ksmandroid.android_tugas_2.views.InventoryFragment
import com.ksmandroid.android_tugas_2.views.ProfileFragment


class MainActivity : AppCompatActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // kita set default nya Home Fragment
        loadFragment(HomeFragment())
        // inisialisasi BottomNavigaionView
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bnv_home)
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this)
    }

    private fun loadFragment(fragment: Fragment?): Boolean {
        if (fragment != null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit()
            return true
        }
        return false
    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        var fragment: Fragment? = null
        when (menuItem.itemId) {
            R.id.bnv_home -> fragment = HomeFragment()
            R.id.bnv_match_history -> fragment = HistoryFragment()
            R.id.bnv_inventory -> fragment = InventoryFragment()
            R.id.bnv_spartan_profile -> fragment = ProfileFragment()
        }
        return loadFragment(fragment)
    }
}