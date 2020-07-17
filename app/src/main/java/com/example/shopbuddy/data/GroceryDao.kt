package com.example.shopbuddy.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface GroceryDao {

    @Query("SELECT * FROM groceries")
    fun getAllItems(): LiveData<List<GroceryEntity>>

    @Query("SELECT * FROM groceries WHERE isChecked=0")
    fun getAllUnchecked(): LiveData<List<GroceryEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(grocery: GroceryEntity)

    @Query("DELETE FROM groceries")
    fun deleteAll()

    @Query("DELETE FROM groceries WHERE isChecked=1")
    fun deleteAllChecked()
}