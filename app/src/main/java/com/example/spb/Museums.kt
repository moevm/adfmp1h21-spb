package com.example.spb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.museums.*

class Museums : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.museums)
        hermitage.setOnClickListener {
            val intent = Intent(this, DetailsHermitage::class.java)
            startActivity(intent)
        }
    }
}