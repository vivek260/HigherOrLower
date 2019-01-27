package com.example.higherorlower

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_correct_guess.*
import org.jetbrains.anko.startActivity

class CorrectGuessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct_guess)
        playAgain()



    }
    fun playAgain(){
        btnPlayAgain.setOnClickListener {
            val intent=Intent("com.example.higherorlower.MainActivity")
            startActivity(intent)
        }
    }

    }

