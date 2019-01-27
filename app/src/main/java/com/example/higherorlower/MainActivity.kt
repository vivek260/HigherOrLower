package com.example.higherorlower

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import java.util.*

class MainActivity : AppCompatActivity() {
    var randomNum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createListenerForButton()
        assignRandomNumber()

    }

    fun generateRandomNumber(): Int {
        var random = Random()
        var min = 1
        var max = 10
        randomNum = random.nextInt(max + 1 - min) + min
        return randomNum
    }

    fun assignRandomNumber() {
        randomNum = generateRandomNumber()

    }

    fun guessNumber() {
        var numberToGuess = randomNum
        var userGuess: Int = Integer.parseInt(numGuess.getText().toString())
        checkUserGuess(userGuess, numberToGuess)
    }

    fun checkUserGuess(userGuess: Int, numberToGuess: Int) {
        if (userGuess > numberToGuess) {
            lblFeedback.setText("Lower and correct answer is $randomNum")
        } else if (userGuess < numberToGuess) {
            lblFeedback.setText("Higher and correct answer is $randomNum")
        } else {
            lblFeedback.setText("Correct!")
            openCorrectGuessScreen()
        }

    }

    fun createListenerForButton() {
        btnGuess.setOnClickListener {
            if (numGuess.getText().toString().equals("")) {
                toast("Please enter a number")
            } else {

                guessNumber()
            }
        }
    }
    fun openCorrectGuessScreen(){
        val intent=Intent("com.example.higherorlower.CorrectGuessActivity")
        startActivity(intent)
    }
}
