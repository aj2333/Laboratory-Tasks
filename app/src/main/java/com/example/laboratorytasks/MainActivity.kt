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

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    private val country = arrayOf("Philippines", "Panama", "Japan", "Canada", "Australia", "United States")
    private val option = arrayOf("Country", "Philippines", "Panama", "Japan", "Canada", "Australia", "United States")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val actvCountry: AutoCompleteTextView = findViewById(R.id.actvCountry)
        val countryAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, country)
        actvCountry.setAdapter(countryAdapter)
        actvCountry.threshold = 1

        val spinner: Spinner = findViewById(R.id.spnOptions)
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, option)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = spinnerAdapter
        spinner.onItemSelectedListener = this
    }

    override fun onItemSelected(
        parent: AdapterView<*>?,
        view: View?,
        position: Int,
        id: Long
    ) {
        val selectedItem = parent?.getItemAtPosition(position).toString()
        Toast.makeText(this, "Selected: $selectedItem", Toast.LENGTH_SHORT).show()
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}
