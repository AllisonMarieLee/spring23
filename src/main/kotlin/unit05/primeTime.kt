
fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    return number % divisor == 0     //modulo operator % makes sure there is no remainder
}

fun isPrime(number: Int): Boolean{
    if (number < 2){
        return false
    }

    for (divisor in 2..Math.sqrt(number.toDouble()).toInt()){
        if (isNumberDivisible (number, divisor)){
            return false
        }
    }
    return true //means the number is prime

}

fun main (){
    println(isPrime(6)) // can divide by 1, 6 (itself) but also 2, 3
    println(isPrime(13)) // can divide by 1 and 13 (itself)
    println(isPrime(8893)) // can divide by 1 and 8893 (itself)
}