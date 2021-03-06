package com.example.shopbuddy.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.shopbuddy.R
import com.example.shopbuddy.ui.fragments.AddGroceryFragment
import com.example.shopbuddy.ui.fragments.CartFragment

class Navigation {

    lateinit var fragmentManager: FragmentManager

    fun openCartFragment(){
        val fragment = CartFragment.newInstance()
        open(fragment)
    }

    fun openAddGroceryFragment(){
        open(AddGroceryFragment.newInstance())
    }

    private fun open(fragment: Fragment){
        fragmentManager.beginTransaction()
            .replace(R.id.grpContainer, fragment)
            .addToBackStack(fragment.toString())
            .commit()
    }

    companion object{
        val instance: Navigation by lazy{
            Navigation()
        }
    }
}