package com.example.shuttle.model

data class Food(val a : Int, val b : String) {
    var foodimg : Int = a
    var foodtext : String = b
}

data class ListContent(
    var image : Int,
    var title : String,
    var category : String
)