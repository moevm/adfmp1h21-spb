package com.example.spb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.theatres.*

class Theatres : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.theatres)
        aleks.setOnClickListener {
            val intent = Intent(this, DetailsAleks::class.java)
            startActivity(intent)
        }
    }


}