package com.example.roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var roll=findViewById<Button>(R.id.button)

        roll.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice()
    {
        var no=findViewById<TextView>(R.id.textView)
        var image=findViewById<ImageView>(R.id.imageView)
        var dice = Dice(6)
        val sides = dice.diceRoll()
        val dr=when(sides)
        {
            1-> R.drawable.one
            2-> R.drawable.two
            3-> R.drawable.three
            4-> R.drawable.four
            5-> R.drawable.five
            else ->{
                R.drawable.six
            }
        }
        image.setImageResource(dr)
        var s=sides.toString()
        no.setText(s)
    }
}

class Dice(private val numSides:Int)
{
    fun diceRoll():Int
    {
        return (1..numSides).random()
    }
}