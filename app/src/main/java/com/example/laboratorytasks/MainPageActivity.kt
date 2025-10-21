package com.example.laboratorytasks

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage_activity)

        val tvWelcome: TextView = findViewById(R.id.tvWelcome)

        val name = intent.getStringExtra("USERNAME")
        val email = intent.getStringExtra("EMAIL")
        val birthday = intent.getStringExtra("BIRTHDAY")
        val city = intent.getStringExtra("CITY")

        tvWelcome.text = "Welcome, $name!\nEmail: $email\nBirthday: $birthday\nCity: $city"
    }
}