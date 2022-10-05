package com.example.assignment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var menus = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBnt.setOnClickListener {
            val decidedMenu = menus.random()
            menuTv.text = decidedMenu
        }

        addFoodBnt.setOnClickListener {
            val newMenu: String = newFoodEditText.text.toString()
            if (newMenu.trim().isNotEmpty()) {
                menus.add(newMenu)
                menuTv.text = newMenu
                newFoodEditText.setText("")
            }
        }
    }


}