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
        var image=findViewById<ImageView>(R.id.imageView)
        var no=findViewById<TextView>(R.id.textView)
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
            1->no.setText(sides)
            2-> R.drawable.two
            2->no.setText(sides)
            3-> R.drawable.three
            3->no.setText(sides)
            3-> R.drawable.three
            4-> R.drawable.four
            4->no.setText(sides)
            5-> R.drawable.five
            5->no.setText(sides)
            6-> R.drawable.six
            6->no.setText(sides)

            else ->{
                Toast.makeText(this,"wrong chioce",Toast.LENGTH_SHORT).show()
            }
        }
        image.setImageResource(dr as Int)
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