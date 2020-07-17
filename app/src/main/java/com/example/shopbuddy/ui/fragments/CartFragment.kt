package com.example.shopbuddy.ui.fragments

import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopbuddy.R
import com.example.shopbuddy.data.GroceryEntity
import com.example.shopbuddy.data.GroceryViewModel
import com.example.shopbuddy.ui.adapters.GroceryAdapter
import com.example.shopbuddy.utils.Navigation
import kotlinx.android.synthetic.main.fragment_cart.*

class CartFragment: BaseFragment() {

    private lateinit var viewModel: GroceryViewModel
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    private lateinit var data: List<GroceryEntity>

    override val layoutRes: Int
        get() = R.layout.fragment_cart

    override fun onFragmentCreated() {
        btnAdd.setOnClickListener { openAddGroceryFragment() }
        setupRecyclerView()

        viewModel = ViewModelProvider(requireActivity()).get(GroceryViewModel::class.java)
        viewModel.groceries.observe(requireActivity(), Observer { items ->
            items?.let { data = it }
        })
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