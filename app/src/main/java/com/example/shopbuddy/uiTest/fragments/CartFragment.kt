package com.example.shopbuddy.uiTest.fragments

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopbuddy.R
import com.example.shopbuddy.data.GroceryEntity
import com.example.shopbuddy.uiTest.adapters.GroceryAdapter
import com.example.shopbuddy.utils.Navigation
import kotlinx.android.synthetic.main.fragment_cart.*

class CartFragment: BaseFragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var data: List<GroceryEntity>

    override val layoutRes: Int
        get() = R.layout.fragment_cart

    override fun onFragmentCreated() {
        btnAdd.setOnClickListener { openAddGroceryFragment() }
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        viewManager = LinearLayoutManager(context)
        viewAdapter = GroceryAdapter(data)

        recyclerView = recGrocery.apply {
            setHasFixedSize(true)
            layoutManager = viewManager
            adapter = viewAdapter
        }
    }

    private fun openAddGroceryFragment(){
        Navigation.instance.openAddGroceryFragment()
    }

    companion object{
        @JvmStatic
        fun newInstance() = CartFragment()
    }
}