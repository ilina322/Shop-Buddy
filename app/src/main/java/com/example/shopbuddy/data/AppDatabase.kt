package com.example.shopbuddy.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [GroceryEntity::class], version = 1)
abstract class AppDatabase: RoomDatabase() {

    abstract fun groceryDao() : GroceryDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null
    }
}