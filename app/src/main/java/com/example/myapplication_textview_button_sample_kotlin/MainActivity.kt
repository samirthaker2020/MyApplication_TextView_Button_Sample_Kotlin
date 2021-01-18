package com.example.myapplication_textview_button_sample_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // fetching ids for button and textview
        val btn_click= findViewById<Button>(R.id.btn_click)
        val result= findViewById<TextView>(R.id.textView_result)

        btn_click.setOnClickListener()
        {
            result.setText("You click on the button")
        }
    }
}