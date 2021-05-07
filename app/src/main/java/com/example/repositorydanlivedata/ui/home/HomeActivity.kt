package com.example.repositorydanlivedata.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.repositorydanlivedata.SectionPagerAdapter
import com.example.repositorydanlivedata.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.title = "Cari FIlm"
        supportActionBar?.elevation = 0f

        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        val sectionPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        activityHomeBinding.viewPager.adapter = sectionPagerAdapter
        activityHomeBinding.tabs.setupWithViewPager(activityHomeBinding.viewPager)

    }

}