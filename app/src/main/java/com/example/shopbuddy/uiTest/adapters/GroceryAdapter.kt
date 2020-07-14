package com.example.shopbuddy.uiTest.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shopbuddy.R
import com.example.shopbuddy.data.GroceryEntity

class GroceryAdapter(private val data: List<GroceryEntity>) : RecyclerView.Adapter<GroceryHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroceryHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_grocery, parent, false) as View
        return GroceryHolder(view)

    }

    override fun onBindViewHolder(holder: GroceryHolder, position: Int) {
        val currentItem = data[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}