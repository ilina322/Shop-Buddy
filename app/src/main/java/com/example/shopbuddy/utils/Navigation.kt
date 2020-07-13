package com.example.shopbuddy.utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.shopbuddy.R
import com.example.shopbuddy.ui.fragments.AddGroceryFragment
import com.example.shopbuddy.ui.fragments.CartFragment
import kotlinx.android.synthetic.main.activity_main.view.*

class Navigation {

    lateinit var fragmentManager: FragmentManager

    public fun openCartFragment(){
        var fragment = CartFragment.newInstance()
        open(fragment)
    }

    public fun openAddGroceryFragment(){
        open(AddGroceryFragment.newInstance())
    }

    private fun open(fragment: Fragment){
        fragmentManager.beginTransaction()
            .replace(R.id.grp_container, fragment)
            .addToBackStack(fragment.toString())
            .commit()
    }

    companion object{
        val instance: Navigation by lazy{
            Navigation()
        }
    }
}