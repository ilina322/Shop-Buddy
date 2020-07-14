package com.example.shopbuddy.uiTest.fragmentsTest

import androidx.fragment.app.testing.FragmentScenario
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.shopbuddy.R
import com.example.shopbuddy.uiTest.fragments.AddGroceryFragment
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestAddGroceryFragment {
    private lateinit var scenario: FragmentScenario<AddGroceryFragment>

    @Before
    fun initFragment(){
        scenario = launchFragmentInContainer<AddGroceryFragment>()
    }

    @Test
    fun testWhenFragmentIsLaunchedThenEdtNameIsDisplayed(){
        onView(withId(R.id.edtName)).check(matches(isDisplayed()))
    }

    @Test
    fun testWhenFragmentIsLaunchedThenEdtPriceIsDisplayed(){
        onView(withId(R.id.edtPrice)).check(matches(isDisplayed()))
    }

    @Test
    fun testWhenFragmentIsLaunchedThenNumQuantityIsDisplayed(){
        onView(withId(R.id.numQuantity)).check(matches(isDisplayed()))
    }
}