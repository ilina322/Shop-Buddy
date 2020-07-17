package com.example.shopbuddy.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "groceries")
class GroceryEntity(@PrimaryKey @ColumnInfo(name = "name") var name: String,
                    @ColumnInfo(name = "quantity") var quantity: Int,
                    @ColumnInfo(name = "price") var price: Double)