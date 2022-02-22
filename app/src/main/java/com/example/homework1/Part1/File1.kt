package com.example.homework1.Part1

fun buy(publication: Publication?){
    println("The purchase is complete. The purchase amount was ${publication?.price}")
}

fun main(){
    val myBook = Book(10, 500)
    val myFavouriteBook = Book(500, 8000)
    val myMagazine = Magazine(5, 400)
    myBook.getInfo()
    myFavouriteBook.getInfo()
    myMagazine.getInfo()

    println("Сравнение по ссылке: ${myBook === myFavouriteBook}")
    println("Сравнение методом equals: ${myBook.equals(myFavouriteBook)}")

    val notNullBook: Book? = Book(1, 1)
    val nullBook: Book? = null
    buy(notNullBook)
    buy(nullBook)

    val sum = {x: Int, y: Int -> println(x+y) }
    sum(5, 4)
}


