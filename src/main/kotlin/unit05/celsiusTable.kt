


fun main (){
    //loop from 0 to 20
    var fahrenheit = 0.0
    while (fahrenheit <= 20){
        val temperature = celsius(fahrenheit.toDouble())
        println("Fahrenheit $fahrenheit -> Celcius $temperature")
        fahrenheit++
    }
}

fun celsius (fahrenheit: Double): Double {
    //C = 5/9 *(F−32)    formula to convert temp from Fahrenheit to Celsius
    val temperature: Double= 5.0/9.0 * (fahrenheit-32.0)
    return temperature
}