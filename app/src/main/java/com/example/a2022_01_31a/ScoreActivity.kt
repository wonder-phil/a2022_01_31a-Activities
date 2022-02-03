package com.example.a2022_01_31a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class ScoreActivity : AppCompatActivity() {

    private val nameText: TextView
        get() = findViewById(R.id.name_view)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score2)

        intent?.let {
            val name = it.getStringExtra("NAME")
            nameText.text = name
        }
    }
}