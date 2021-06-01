package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val view1 : View = findViewById(R.id.box_one_text)
        val view2 : View = findViewById(R.id.box_two_text)
        val view3 : View = findViewById(R.id.box_three_text)
        val view4 : View = findViewById(R.id.box_four_text)
        val view5 : View = findViewById(R.id.box_five_text)
        val view6 : View = findViewById(R.id.constraint_layout)
        val view7 : View = findViewById(R.id.yellow_button)
        val view8 : View = findViewById(R.id.red_button)
        val view9 : View = findViewById(R.id.green_button)



        val clickableViews: List<View> =
            listOf(view1, view2, view3, view4,
                view5,view6,view7,view8,view9)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }

        }
    }

    private
    fun makeColored(view: View) {
        val view3 : View = findViewById(R.id.box_three_text)
        val view4 : View = findViewById(R.id.box_four_text)
        val view5 : View = findViewById(R.id.box_five_text)
        when (view.id) {
            //Boxes using color class colors for background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            //Boxes using Android color resources for background
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            // Boxes using costum colors for background
            R.id.red_button -> view3.setBackgroundResource(R.color.my_red)
            R.id.yellow_button->view4.setBackgroundResource(R.color.my_yellow)
            R.id.green_button->view5.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}

