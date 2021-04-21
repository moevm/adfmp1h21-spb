package com.example.spb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_spravochnik.*

class Theatres : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.theatres)
        /*theatres.setOnClickListener {
            val intent = Intent(this, Spravochnik::class.java)
            startActivity(intent)
        }*/
    }


}