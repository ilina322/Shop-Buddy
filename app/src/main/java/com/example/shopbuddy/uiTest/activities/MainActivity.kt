package com.example.shopbuddy.uiTest.activities

import com.example.shopbuddy.R
import com.example.shopbuddy.utils.Navigation

class MainActivity : BaseActivity() {
    override val layoutRes: Int
        get() = R.layout.activity_main

    override fun onViewCreated() {
        Navigation.instance.fragmentManager = supportFragmentManager
        openCartFragment()
    }

    private fun openCartFragment(){
        Navigation.instance.openCartFragment()
    }

}