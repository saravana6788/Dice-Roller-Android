package com.tvlabs.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            rollDice()
        val rollButton:Button=findViewById(R.id.button)
        rollButton.setOnClickListener {
           rollDice()
        }
    }

    private fun rollDice(){
        val dice1resultView =findViewById<ImageView>(R.id.imageView)
        val rolledNumber=Dice(6).roll()
        dice1resultView.setImageResource(chooseDiceImage(rolledNumber))
        dice1resultView.contentDescription=rolledNumber.toString()

        val dice2resultView=findViewById<ImageView>(R.id.imageView3)
        val rolledNumber2=Dice(6).roll()
        dice2resultView.setImageResource(chooseDiceImage(rolledNumber2))
        dice2resultView.contentDescription=rolledNumber2.toString()


    }

    private fun chooseDiceImage(rolledNumber:Int):Int{
        return when(rolledNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }
    }
}