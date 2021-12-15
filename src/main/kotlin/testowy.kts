fun myFunction(){
    println("myFunction()")
}


fun myFun2(fname: String){
    println("$fname myFun2")
}


fun myFun3(x: Int) : Int{
    return x * x
}


// skrocona wersja return
fun myFun4(x: Int, y: Int) = x + y


//fun main(args : Array<String>){
fun main(){
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
    var surname: String = "Jordan"
    println("$surname $name")

    println("Typy danych: ")
    val myNum : Int = 5
    val myDoubleNum : Double = 5.99
    val myLetter : Char = 'D'
    val myBoolean : Boolean = true
    val myText : String = "Hello"
    println("myNum: $myNum, myDoubleNum: $myDoubleNum, myLetter: $myLetter, myBoolean: $myBoolean, myText: $myText")

    val num1 : Byte = 100
    val num2 : Short = 5000
    val num3 : Int = 100000
    val num4 : Long = 15000000000L
    println("num1: $num1, num2: $num2, num3: $num3, num4: $num4")

    val myFloat: Float = 5.75F
    val myDouble: Double = 19.99

    println("$myFloat ~ $myDouble")
    println("Float ma precyzje szesciu-siedmu cyfr, a double pietnastu. ")

    val x : Int = 5
    val xLong : Long = x.toLong()
    val xByte : Byte = x.toByte()
    val xShort : Short = x.toShort()

    println("Operatory: +, -, *, /, %, ++, -- ")
    println("Operatory przypisania: =, +=, *=, /=, %= ")
    println("Operatory porównania: ==, !=, >, <, >=, <=")
    println("Operatory logiczne: &&, ||, !")

    var y : Int
    if (x == xLong.toInt()){
        println("Sa rowne!")
        y = x + 1
    } else {
        println("Nie sa rowne!")
        y = x - 1
    }

    val time = 20
    val greeting = if (time < 18) "Good day" else "Good evening"
    println(greeting)

    /* wyrazenie when - analogiczne do switch w javie */
    val day = 4

    val result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }
    println(result)

    // petla while(condition){ code block }
    var i = 0
    while (i < 5){
        println(i)
        i++
    }

    // petla do{ code block } while( condition )
    do{
        println(i)
        i--
    }
    while( i > 0)

    println("Wyrazenie 'break' wyskakuje poza petle, a wyrazenie 'continue' przerywa pojedyncza iteracje")

    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
    cars[0] = "Opel"
    println(cars.size)
    if ("Volvo" in cars){
        println("mamy volvo")
    } else {
        println("Nie mamy volva.")
    }
    println("Petla po tablicy: ")
    for (xy in cars){
        println(xy)
    }

    println("W kotlinie petla for() jest uzywana do iterowania po tablicach, zakresach i pozostalych iteratorach.")

    for (chars in 'a'..'x'){
        println(chars)
    }
    for (nums in 5..15){
        println(nums)
    }

    myFunction()
    myFun2("Kat")

    print(myFun3(15))

    //https://www.w3schools.com/kotlin/kotlin_functions.php


}