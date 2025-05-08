package com.example.navigationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class SayfaB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_b)

        findViewById<Button>(R.id.btnGoY).setOnClickListener {
            val intent = Intent(this, SayfaY::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)  // Bu önemli: Geri tuşu anasayfaya dönsün diye.
            startActivity(intent)
        }
    }
}
