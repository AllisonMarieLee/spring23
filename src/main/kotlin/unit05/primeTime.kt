import kotlin.math.sqrt

fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0  //modulo operator % makes sure there is no remainder
}
//loop for sqrt of number
fun isPrime(number: Int): Boolean {
    if (number < 2) {
        return false
    }
    var i = 2  //counter variable
    val sqrtNumber = sqrt(number.toDouble()).toInt()  //calculates the square root of number
    while (i <= sqrtNumber) {
        if (isNumberDivisible(number, i)){
        return false
    }
    i++
    }
    return true
}

fun main (){
    println(isPrime(6)) // can divide by 1, 6 (itself) but also 2, 3
    println(isPrime(13)) // can divide by 1 and 13 (itself)
    println(isPrime(8893)) // can divide by 1 and 8893 (itself)
}