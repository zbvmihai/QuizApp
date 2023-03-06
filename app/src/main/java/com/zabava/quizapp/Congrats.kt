package com.zabava.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Congrats : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_congrats)
        val tvName: TextView = findViewById(R.id.tvName)
        val tvScore: TextView = findViewById(R.id.tvScore)
        val btnFinish: Button = findViewById(R.id.finishButton)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        tvScore.text = "Your score is ${
            intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        } out of ${intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)}"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

    }

}