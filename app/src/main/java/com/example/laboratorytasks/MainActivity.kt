package com.example.laboratorytasks

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnStandard: Button = findViewById(R.id.btnStandard)
        val btnRing: ImageButton = findViewById(R.id.btnRing)
        val btnToggle: ToggleButton = findViewById(R.id.btnToggle)

        btnToggle.setOnClickListener {
            val state = if (btnToggle.isChecked) "ON" else "OFF"
            Toast.makeText(this, "THE BUTTON IS $state", Toast.LENGTH_SHORT).show()
        }

        btnRing.setOnClickListener {
            Toast.makeText(this, "THIS BUTTON IS RINGING", Toast.LENGTH_SHORT).show()
        }

        btnStandard.setOnClickListener {
            Toast.makeText(this, "THIS BUTTON PERFORMS ADDITION", Toast.LENGTH_SHORT).show()
        }
    }
}