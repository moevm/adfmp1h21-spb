package com.example.spb

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gid.*

class Gid: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gid)

        what_is_near.setOnClickListener {
            val intent = Intent(this, Near::class.java)
            startActivity(intent)
        }

        paths_button.setOnClickListener {
            val intent = Intent(this, ReadyPaths::class.java)
            startActivity(intent)
        }
    }
}