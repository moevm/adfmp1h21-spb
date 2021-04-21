package com.example.spb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spravochnik.setOnClickListener {
            val intent = Intent(this, Spravochnik::class.java)
            startActivity(intent)
        }

        gid_button.setOnClickListener {
            val intent = Intent(this, Gid::class.java)
            startActivity(intent)
        }


    }

}