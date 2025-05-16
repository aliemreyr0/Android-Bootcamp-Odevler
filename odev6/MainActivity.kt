package com.example.calmmind

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: MeditationAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val meditations = listOf(
            Meditation("Rahat Uyku", "10 dk", R.drawable.meditation_bg1),
            Meditation("Odaklanma", "8 dk", R.drawable.meditation_bg2),
            Meditation("Sakinlik", "12 dk", R.drawable.meditation_bg3)
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = MeditationAdapter(meditations)
        recyclerView.adapter = adapter
    }
}
