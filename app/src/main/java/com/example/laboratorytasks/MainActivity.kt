package com.example.laboratorytasks

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    private val country = arrayOf("Philippines", "Panama", "Japan", "Canada", "Australia", "United States")
    private val option = arrayOf("Country", "Philippines", "Panama", "Japan", "Canada", "Australia", "United States")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)



    }
}