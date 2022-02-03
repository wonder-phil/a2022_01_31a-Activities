package com.example.a2022_01_31a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private val scoreButton: Button
        get() = findViewById(R.id.launch_score)

    private val nameText: EditText
        get() = findViewById(R.id.name_view)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scoreButton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                Intent(baseContext,ScoreActivity::class.java).also{
                    scoreActivity ->
                        scoreActivity.putExtra("NAME", nameText.text.toString())
                    startActivity(scoreActivity)
                }
            }
        })
    }
}