package com.example.shuttle.infomation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.example.shuttle.R
import com.example.shuttle.details.DetailAdapter
import com.google.android.material.tabs.TabLayout

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val view = findViewById<ViewPager>(R.id.detail_viewpager)
        view.adapter = DetailAdapter(supportFragmentManager)
        val tap = findViewById<TabLayout>(R.id.infotab)
        tap.setupWithViewPager(view)
    }
}