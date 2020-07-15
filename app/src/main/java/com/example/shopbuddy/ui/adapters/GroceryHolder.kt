package com.example.shopbuddy.ui.adapters

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.shopbuddy.data.GroceryEntity
import kotlinx.android.synthetic.main.item_grocery.view.*

class GroceryHolder(private val view: View) : RecyclerView.ViewHolder(view) {

    fun bind(currentItem: GroceryEntity) {
        view.checkGrocery.text = currentItem.name
    }
}