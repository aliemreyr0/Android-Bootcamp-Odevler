package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var total: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResult = findViewById<TextView>(R.id.tvResult)
        val etInput = findViewById<EditText>(R.id.etInput)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val btnReset = findViewById<Button>(R.id.btnReset)

        btnAdd.setOnClickListener {
            val inputText = etInput.text.toString()
            if (inputText.isNotEmpty()) {
                val number = inputText.toInt()
                total += number
                tvResult.text = total.toString()
                etInput.text.clear()
            } else {
                Toast.makeText(this, "Lütfen bir sayı giriniz", Toast.LENGTH_SHORT).show()
            }
        }

        btnReset.setOnClickListener {
            total = 0
            tvResult.text = "0"
            etInput.text.clear()
        }
    }
}
