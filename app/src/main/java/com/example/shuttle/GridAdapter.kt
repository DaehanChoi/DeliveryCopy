package com.example.shuttle

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.shuttle.model.Food

class GridAdapter(val context: Context, val foodList: Array<Food>) : BaseAdapter() {
    override fun getCount(): Int = foodList.size

    override fun getItem(p0: Int): Any = 0

    override fun getItemId(p0: Int): Long = 0

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater = LayoutInflater.from(context).inflate(R.layout.grid_item, null)
        val image = inflater.findViewById<ImageView>(R.id.grid_img)
        val text = inflater.findViewById<TextView>(R.id.grid_text)
        image.setImageResource(foodList[p0].foodimg)
        text.text = (foodList[p0].foodtext)
        return inflater
    }

}