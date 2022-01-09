package com.example.nge_vent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.nge_vent.databinding.ActivityMainBinding
import com.example.nge_vent.fragment.HomeFragment
import com.example.nge_vent.fragment.ProfilFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.ismaeldivita.chipnavigation.ChipNavigationBar


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val fragment :Fragment? =
            supportFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)

        if (fragment !is HomeFragment) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, homeFragment, HomeFragment::class.java.simpleName)
                .commit()
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.bottomNav.setItemSelected(R.id.menu_home)
        loadFragment(HomeFragment())

        binding.bottomNav.setOnItemSelectedListener { id ->
            when (id) {
                R.id.menu_home -> loadFragment(HomeFragment())
                R.id.menu_user -> loadFragment(ProfilFragment())
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            commit()

        }
    }
}