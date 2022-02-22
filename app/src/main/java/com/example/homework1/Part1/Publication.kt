package com.example.homework1.Part1

import java.text.NumberFormat
import java.util.*

interface Publication{
    val price: Int
    val wordCount: Int
    fun getType(): String

    fun getInfo(){
        println("Type: ${getType()}")
        println("WordCount: $wordCount")
        val nF= NumberFormat.getCurrencyInstance()
        nF.currency = Currency.getInstance("EUR")
        println("Price: ${nF.format(price)}\n")
    }
}