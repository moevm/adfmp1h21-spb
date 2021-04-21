package com.example.spb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.cathedrals.*

class Cathedrals: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cathedrals)
        isaak.setOnClickListener {
            val intent = Intent(this, DetailsIsaak::class.java)
            startActivity(intent)
        }

    }
}