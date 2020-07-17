package com.example.shopbuddy.data

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.w3c.dom.Entity

class GroceryViewModel(application: Application): AndroidViewModel(application)  {

    private val databaseInstance = DatabaseInstance(application)
    private lateinit var groceryRepository: GroceryRepository
    lateinit var groceries: LiveData<List<GroceryEntity>>

    init {
        val dao = databaseInstance.db.groceryDao()
        groceryRepository = GroceryRepository(dao)
        groceries = dao.getAllItems()
    }

    fun insert(groceryEntity: GroceryEntity) = viewModelScope.launch { groceryRepository.insert(groceryEntity) }
}