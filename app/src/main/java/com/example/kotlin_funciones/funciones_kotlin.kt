package com.example.kotlin_funciones

fun main(){


    println(birthdayGreeting())
    birthdayGreeting2()
    println(birthdayGreeting3("Wisner"))
    println(birthdayGreeting(age = 5))
    println(birthdayGreeting("Rex", 2))
    fun main() {
        println(birthdayGreeting("Rover", 5))
        println(birthdayGreeting("Rex", 2))
    }

}

fun birthdayGreeting2() {
    println("Happy Birthday, Rover!")
    println("You are now 5 years old!")
}

fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
fun birthdayGreeting3(name: String): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
fun birthdayGreeting(name: String="Juan", age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}