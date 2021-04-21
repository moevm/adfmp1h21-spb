package com.example.spb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.ready_paths.*

class ReadyPaths : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ready_paths)

        map1.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        map2.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        map3.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        map4.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }

        map5.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }
    }
}