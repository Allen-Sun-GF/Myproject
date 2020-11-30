package com.allen

fun main(args: Array<String>) {
    //println("Hello Kotlin");
    //Human().hello()
    val h = Human()
    h.hello()
    var age = 19
    age = 20
    val name = "Allen"
    var name2 : String
    name2 = "Allen2"
}

class Human {
     fun hello() {
         println("Hello kotlin")
     }
}