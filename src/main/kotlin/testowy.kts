// https://www.w3schools.com/kotlin/kotlin_variables.php

fun main(args : Array<String>){
    println("Hello world - main")
    print("Nie przechodzimy do nastepnej linii. ")
    // komentarz jednoliniowy
    println("Natomiast println zawiera znak konca wiersza. ")
    /* komentarz
    * wieloliniowy */

    var name = "John"
    val date = 1975
    /*  pierwsza z nich moze zmieniac przechowywane wartosci,
     * natomiast druga jest stala.
     * */
    println("name: $name, date: $date")
    name = "Jacob"
    var surname: String = "Michael"
    surname = "Jordan"
    println(surname)

    println("Typy danych: ")
    val myNum : Int = 5
    val myDoubleNum : Double = 5.99
    val myLetter : Char = 'D'
    val myBoolean : Boolean = true
    val myText : String = "Hello"


}