package com.example.shopbuddy.ui.fragments

import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.shopbuddy.R
import com.example.shopbuddy.data.GroceryEntity
import com.example.shopbuddy.data.GroceryViewModel
import kotlinx.android.synthetic.main.fragment_add_item.*
import kotlinx.android.synthetic.main.fragment_cart.*

class AddGroceryFragment : BaseFragment() {

    override val layoutRes: Int
        get() = R.layout.fragment_add_item

    override fun onFragmentCreated() {
        setupNumberPicker()

    }


    private fun setupNumberPicker() {
        numQuantity.minValue =
            QUANTITY_MIN
        numQuantity.maxValue =
            QUANTITY_MAX
    }

    companion object{
        const val QUANTITY_MIN = 0
        const val QUANTITY_MAX = 1000
        @JvmStatic
        fun newInstance() =
            AddGroceryFragment()
    }

}