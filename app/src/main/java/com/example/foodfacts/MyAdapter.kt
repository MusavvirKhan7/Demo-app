package com.example.foodfacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var foodArrayList: ArrayList<food>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
       val itemview = LayoutInflater.from(parent.context).inflate(R.layout.eachrow, parent, false)
        return MyViewHolder(itemview)
    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
       var currentitem = foodArrayList[position]
        holder.htitle.text = currentitem.foodname
        holder.himg.setImageResource(currentitem.foodimg)
    }

    override fun getItemCount(): Int {
        return foodArrayList.size

    }

    class MyViewHolder (itemview: View): RecyclerView.ViewHolder(itemview) {

        val htitle = itemview.findViewById<TextView>(R.id.foodtitle)
        val himg = itemview.findViewById<ShapeableImageView>(R.id.foodpic)

    }
}