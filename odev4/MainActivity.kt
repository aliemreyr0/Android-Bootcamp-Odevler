package com.example.navigationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnGoA).setOnClickListener {
            startActivity(Intent(this, SayfaA::class.java))
        }

        findViewById<Button>(R.id.btnGoX).setOnClickListener {
            startActivity(Intent(this, SayfaX::class.java))
        }
    }
}
