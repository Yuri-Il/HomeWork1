package com.example.homework1.Part2

import java.text.SimpleDateFormat
import java.util.Date

class User(val id: Int, val name: String, val age: Int, val type: Type){
    val startTime: String by lazy{getstartTime()}
    fun getstartTime(): String{
        val sdf = SimpleDateFormat("hh:mm:ss")
        val currentTime = sdf.format(Date())
        return currentTime
    }

}