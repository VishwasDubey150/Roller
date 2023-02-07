package com.example.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var image=findViewById<ImageView>(R.id.imageView)
        var no=findViewById<TextView>(R.id.textView)
        var roll=findViewById<Button>(R.id.button)

        roll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice()
    {
        var dice=Dice(6)
        val dr=when(dice.diceRoll())
    }
}