package com.example.homework1.Part1

class Book(override val price: Int, override val wordCount: Int): Publication {
    override fun getType(): String {
        return when {
            (wordCount <= 1000) -> "Flash Fiction"
            (wordCount <= 7500) -> "Short Story"
            else -> "Novel"
        }
    }
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || other.javaClass != javaClass) return false
        return (other is Book) && price == other.price && wordCount == other.wordCount && getType() == other.getType()
    }

    //auto generated
    override fun hashCode(): Int {
        var result = price
        result = 31 * result + wordCount
        return result
    }
}