package com.example.shopbuddy.ui.fragments

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopbuddy.R
import com.example.shopbuddy.data.GroceryEntity
import com.example.shopbuddy.ui.adapters.GroceryAdapter
import com.example.shopbuddy.ui.adapters.GroceryHolder
import com.example.shopbuddy.utils.Navigation
import kotlinx.android.synthetic.main.fragment_cart.*

class CartFragment: BaseFragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private var data: MutableList<GroceryEntity> = mutableListOf()

    override val layoutRes: Int
        get() = R.layout.fragment_cart

    override fun onFragmentCreated() {
        //test
        setData()

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

    private fun setData(){
        var item1 = GroceryEntity()
        var item2 = GroceryEntity()
        var item3 = GroceryEntity()
        var item4 = GroceryEntity()

        item1.name = "asdf"
        item2.name = "asdf"
        item3.name = "asdf"
        item4.name = "asdf"

        data.add(item1)
        data.add(item2)
        data.add(item3)
        data.add(item4)
    }

    companion object{
        @JvmStatic
        fun newInstance() = CartFragment()
    }

}