package com.example.e_learning

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Buttons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        val btncall = findViewById<Button>(R.id.button12)
        val btnad = findViewById<ImageView>(R.id.imageView)
        val btnios = findViewById<ImageView>(R.id.imageView2)
        val btnai = findViewById<ImageView>(R.id.imageView3)
        val btnml = findViewById<ImageView>(R.id.imageView4)
        val btnbchain = findViewById<ImageView>(R.id.imageView5)
        val btnweb = findViewById<ImageView>(R.id.imageView6)


        btncall.setOnClickListener{

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:+91 8010908425")
            startActivity(intent)
        }

        btnad.setOnClickListener {
            intent = Intent(applicationContext, android::class.java)
            startActivity(intent)

        }

        btnios.setOnClickListener {
            intent = Intent(applicationContext, ios_development::class.java)
            startActivity(intent)

        }
        btnai.setOnClickListener {
            intent = Intent(applicationContext, artificialintellegence::class.java)
            startActivity(intent)

        }
        btnml.setOnClickListener {
            intent = Intent(applicationContext, ML::class.java)
            startActivity(intent)

        }
        btnbchain.setOnClickListener {
            intent = Intent(applicationContext, blockchain::class.java)
            startActivity(intent)

        }
        btnweb.setOnClickListener {
            intent = Intent(applicationContext, web::class.java)
            startActivity(intent)

        }

    }
}