package com.example.spb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.what_is_near.*

class Near : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.what_is_near)

        map.setOnClickListener {
            val intent = Intent(this, Map::class.java)
            startActivity(intent)
        }
    }
}