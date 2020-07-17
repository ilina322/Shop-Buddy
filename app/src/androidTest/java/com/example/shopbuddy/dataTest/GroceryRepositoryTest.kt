package com.example.shopbuddy.dataTest

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import com.example.shopbuddy.data.AppDatabase
import com.example.shopbuddy.data.GroceryDao
import com.example.shopbuddy.data.GroceryEntity
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GroceryRepositoryTest{

    private lateinit var groceryDao: GroceryDao

    @Before
    fun initDao(){
        groceryDao = AppDatabase.getDatabase(InstrumentationRegistry.getInstrumentation().targetContext).groceryDao()
    }

    @Test
    fun insertAndGetUser() = runBlocking {
        val item = GroceryEntity("item", 2, 3.5)
        groceryDao.insert(item)
        val groceriesFromDb = groceryDao.getAllItems()
        assertEquals(listOf(item), groceriesFromDb)
    }
}