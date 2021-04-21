package com.example.spb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_spravochnik.*

class Spravochnik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spravochnik)

        theatres.setOnClickListener {
            val intent = Intent(this, Theatres::class.java)
            startActivity(intent)
        }

        bridges.setOnClickListener {
            val intent = Intent(this, Bridges::class.java)
            startActivity(intent)
        }

        museums.setOnClickListener {
            val intent = Intent(this, Museums::class.java)
            startActivity(intent)
        }

        cathedrals.setOnClickListener {
            val intent = Intent(this, Cathedrals::class.java)
            startActivity(intent)
        }
    }


}
