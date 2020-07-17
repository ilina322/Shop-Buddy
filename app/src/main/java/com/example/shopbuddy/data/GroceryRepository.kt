package com.example.shopbuddy.data

import androidx.lifecycle.LiveData

class GroceryRepository(private val dao: GroceryDao) {

    val allItems: LiveData<List<GroceryEntity>> = dao.getAllItems()

    suspend fun insert(item: GroceryEntity){
        dao.insert(item)
    }
}