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

    if (x == xLong.toInt()){
        println("Sa rowne!")

    } else {
        println("Nie sa rowne!")
    }

}