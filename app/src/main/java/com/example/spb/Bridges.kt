package com.example.spb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.bridges.*

class Bridges: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bridges)

        map11.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        map12.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        map13.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        map14.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        map15.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        map16.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }
    }
}