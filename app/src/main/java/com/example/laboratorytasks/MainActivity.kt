package com.example.laboratorytasks

import android.widget.FrameLayout
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.Toast
import android.widget.ToggleButton
import android.widget.ViewSwitcher
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){

    private var img = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var imageSwitcher: ImageSwitcher = findViewById(R.id.lift)
        var btnSwitch: Button = findViewById(R.id.btnSwitch)

        imageSwitcher.setFactory(ViewSwitcher.ViewFactory {
            val imageView = ImageView(applicationContext)
            imageView.scaleType = ImageView.ScaleType.CENTER_CROP
            imageView.layoutParams = FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
            imageView
        })

        imageSwitcher.setImageResource(R.drawable.lift)

        btnSwitch.setOnClickListener {
            if(img) {
                imageSwitcher.setImageResource(R.drawable.lift2)
                Toast.makeText(this, "Image2", Toast.LENGTH_SHORT).show()
            }
            else {
                imageSwitcher.setImageResource(R.drawable.lift)
                Toast.makeText(this, "Image1", Toast.LENGTH_SHORT).show()
            }
            img = !img
        }
    }
}