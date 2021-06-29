package com.tvlabs.diceroller

class Dice(val sides:Int) {

    fun roll():Int{
        return (1..sides).random()
    }
}