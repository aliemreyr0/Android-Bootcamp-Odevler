package com.example.navigationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class SayfaA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_a)

        findViewById<Button>(R.id.btnGoB).setOnClickListener {
            startActivity(Intent(this, SayfaB::class.java))
        }
    }
}
