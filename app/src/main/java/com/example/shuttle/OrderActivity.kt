package com.example.shuttle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.shuttle.fragments.FragmentAdapter

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        val viewPager = findViewById<ViewPager>(R.id.order_view_pager)
        viewPager.adapter = fragmentAdapter
    }
}