package com.example.shopbuddy.ui.activities

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

abstract class BaseActivity: FragmentActivity() {

    protected abstract val layoutRes: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setContentView(layoutRes)
        onViewCreated()
    }

    abstract fun onViewCreated()
}