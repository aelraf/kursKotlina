class Car {
    var brand = ""
    var model = ""
    var year = 0
}


class Auto(var brand: String, var model: String, var year: Int){
    fun drive(){
        println("Wroooom!")
    }

    fun speed(maxSpeed: Int){
        println("Max speed is: $maxSpeed")
    }

}


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val c1 = Car()

    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1970

    println("brand: ${c1.brand}, model: ${c1.model}, year: ${c1.year}")

    val a1 = Auto("BMW", "X5", 1999)
    val a2 = Auto("Mercedes", "S", 2020)
    val a3 = Auto("Tesla", "Model S", 2020)

    a1.drive()
    a1.speed(200)

}

