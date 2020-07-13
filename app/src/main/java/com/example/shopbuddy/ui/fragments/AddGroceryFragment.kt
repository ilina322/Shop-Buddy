package com.example.shopbuddy.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.shopbuddy.R

class AddGroceryFragment : BaseFragment() {

    override val layoutRes: Int
        get() = R.layout.fragment_add_item

    companion object{
        @JvmStatic
        fun newInstance() = AddGroceryFragment()
    }

}