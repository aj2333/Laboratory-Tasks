package com.example.laboratorytasks

import android.content.Intent
import android.widget.FrameLayout
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.Spinner
import android.widget.Toast
import android.widget.ViewSwitcher
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.etName)
        val etEmail: EditText = findViewById(R.id.etEmail)
        val etBrithday: EditText = findViewById(R.id.etBirthday)
        val spnMunicipality: Spinner = findViewById(R.id.spnMunicipality)
        val btnSubmit: Button = findViewById(R.id.btnSubmit)

        val city = arrayOf("Select City", "Taguig City", "Muntinlupa City", "Parañque City", "Las Piñas City")
        val spinnerAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, city)
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spnMunicipality.adapter = spinnerAdapter

        btnSubmit.setOnClickListener {
            val name = etName.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val birthday = etBrithday.text.toString().trim()
            val city = spnMunicipality.selectedItem.toString()

            if (name.isNotEmpty() && email.isNotEmpty() && birthday.isNotEmpty() && city != "Select City") {
                val intent = Intent(this, MainPageActivity::class.java)
                intent.putExtra("USERNAME", name)
                intent.putExtra("EMAIL", email)
                intent.putExtra("BIRTHDAY", birthday)
                intent.putExtra("CITY", city)
                startActivity(intent)
            }
            else {
                Toast.makeText(this, "Please fill out all fields!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}