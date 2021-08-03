package com.example.mymathapp.data

import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    var name: String = ""
    var num1: Int = 0
    var num2: Int = 0
    var score: Int = 0

    fun generateQuestion():String{
        var num1 = (Math.random()*100).toInt()
        var num2 = (Math.random()*100).toInt()

        return "${num1} + ${num2} = ?"
    }

    fun getQuestion():String{
        return "${num1} + ${num2} = ?"
    }

    fun getAnswer():Int{
        return num1 + num2
    }
}