package com.example.shopbuddy.uiTest.fragmentsTest

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.shopbuddy.R
import com.example.shopbuddy.uiTest.fragments.CartFragment

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Before

@RunWith(AndroidJUnit4::class)
class TestCartFragment {

    lateinit var scenario: FragmentScenario<CartFragment>

    @Before
    fun initFragment(){
        scenario = launchFragmentInContainer<CartFragment>()
    }

    @Test
    fun testWhenCartFragmentIsLaunchedThenAddButtonIsDisplayed(){
        onView(withId(R.id.btnAdd)).check(matches(isDisplayed()))
    }

    @Test
    fun testWhenCartFragmentIsLaunchedThenGroceryRecViewIsDisplayed(){
        onView(withId(R.id.recGrocery)).check(matches(isDisplayed()))
    }

}