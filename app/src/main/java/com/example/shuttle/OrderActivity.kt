package com.example.shuttle

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.viewpager.widget.ViewPager
import com.example.shuttle.fragments.FragmentAdapter
import com.google.android.material.tabs.TabLayout

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        val viewPager = findViewById<ViewPager>(R.id.order_view_pager)
        viewPager.adapter = fragmentAdapter
        val tab = findViewById<TabLayout>(R.id.tab_container)
        // 자동으로 연결하고, 탭의 이름은 프래그먼트 제목으로 설정해
        tab.setupWithViewPager(viewPager)

    }

}