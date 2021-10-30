package com.example.shuttle.fragments

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListAdapter
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity

import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.shuttle.R
import com.example.shuttle.infomation.InfoActivity
import com.example.shuttle.model.ListContent
import android.content.Intent as Intent

class ListItemAdapter(val context: Context, private val item : Array<ListContent> ) :
    RecyclerView.Adapter<ListItemAdapter.ViewHolder>(){

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val image : ImageView? = view.findViewById(R.id.listview_img)
        val title : TextView? = view.findViewById(R.id.title_area)
        val category : TextView? = view.findViewById(R.id.section_area)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.listview_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val temp = item[position]
        holder.image?.setImageResource(temp.image)
        holder.title?.text = temp.title
        holder.category?.text = temp.category
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, InfoActivity::class.java)
            holder.itemView.context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int = item.size

}