package com.example.navigationapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SayfaY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_y)
    }

    override fun onBackPressed() {
        // Geri tuşuna basınca direk Anasayfa'ya dön
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
}
