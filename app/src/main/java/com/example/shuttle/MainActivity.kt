package com.example.shuttle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.viewpager.widget.ViewPager
import com.example.shuttle.model.Food

class MainActivity : AppCompatActivity() {
    lateinit var viewpager : ViewPager
    lateinit var gridview : GridView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val food = arrayOf(
            Food(R.drawable.img_1, "a"),
            Food(R.drawable.img_2, "a"),
            Food(R.drawable.img_3, "a"),
            Food(R.drawable.img_4, "a"),
            Food(R.drawable.img_5, "a"),
            Food(R.drawable.img_6, "a"),
            Food(R.drawable.img_7, "a"),
            Food(R.drawable.img_8, "a"),
            Food(R.drawable.img_9, "a"),
            Food(R.drawable.img_10, "a"),
            Food(R.drawable.img_11, "a"),
            Food(R.drawable.img_12, "a"),
        )

        gridview = findViewById(R.id.gridview)
        gridview.adapter = GridAdapter(this, food)
        gridview.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, OrderActivity::class.java)
            startActivity(intent)
        }
        viewpager = findViewById(R.id.slider)
        viewpager.adapter = ViewPagerAdapter(this)

    }
}