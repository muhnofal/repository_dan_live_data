package com.example.architecturecomponent.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.architecturecomponent.SectionPagerAdapter
import com.example.architecturecomponent.databinding.ActivityHomeBinding

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