package com.example.majorenvironmentalmovements

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var newsArrayList: ArrayList<News>,var context :Activity) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>()
{
    lateinit var myListener : onItemClickListener
    interface onItemClickListener {
        fun onItemClick(position : Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        myListener = listener
    }
    // to create new view instance
    //when layout manager fails to find a suitable view for each item
    override fun onCreateViewHolder(parent: ViewGroup, viewType :Int):MyAdapter.MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachnews,parent,false)
        return MyViewHolder(itemView,myListener)
    }

    // populate item with data
    override fun onBindViewHolder(holder : MyAdapter.MyViewHolder,position :Int) {
       var currentItem  = newsArrayList[position]
        holder.header.text = currentItem.newsHeading
        holder.image.setImageResource(currentItem.newsImage)
    }

    //returns the number of items in the array
    override fun getItemCount(): Int {
        return newsArrayList.size
    }
    // it hold view , so that view are not created everytime,so it helps in saving memory
    class MyViewHolder (itemView : View,listener: onItemClickListener):RecyclerView.ViewHolder(itemView) {
    val header = itemView.findViewById<TextView>(R.id.tvheading)
    val image =itemView.findViewById<ShapeableImageView>(R.id.headingimage)

        init {
            itemView.setOnClickListener {
            listener.onItemClick(adapterPosition)
            }
        }
    }

}