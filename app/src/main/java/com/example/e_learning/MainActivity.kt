package com.example.e_learning

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLetsgo = findViewById<Button>(R.id.button)
        btnLetsgo.setOnClickListener {

            intent = Intent(applicationContext, Buttons::class.java)
            startActivity(intent)
        }
    }
}