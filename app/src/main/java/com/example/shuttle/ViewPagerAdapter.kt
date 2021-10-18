package com.example.shuttle

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.getSystemService
import androidx.core.content.res.ColorStateListInflaterCompat.inflate
import androidx.core.content.res.ComplexColorCompat.inflate
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPagerAdapter (private val context : Context) : PagerAdapter() {

    private var layoutInflater : LayoutInflater? = null
    val Image = arrayOf(
        R.drawable.dderk,
        R.drawable.galbi,
        R.drawable.pizza,
        R.drawable.taco

    )

    override fun getCount(): Int = Image.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(container.context)
        val view = inflater.inflate(R.layout.pager_layout, container, false)
        view.findViewById<ImageView>(R.id.image_src).setImageResource(Image[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }

}