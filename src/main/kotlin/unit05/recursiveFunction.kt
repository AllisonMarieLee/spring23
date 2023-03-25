fun fibonacci (number: Int): Int{
    return when (number) {
        1, 2 -> 1   //to start the sequence, hard-code return value of 1 when number equals 1 or 2
        in Int.MIN_VALUE..0 -> 0
        else -> fibonacci (number-1) + fibonacci(number -2)
    }
}

fun main(){
    println(fibonacci(-1)) // = 0   //extra test
    println(fibonacci(0))  // = 0   //extra test
    println(fibonacci(1))  // = 1
    println(fibonacci(2))  // = 1
    println(fibonacci(3))  // = 2
    println(fibonacci(4))  // = 3
    println(fibonacci(5))  // = 5
    println(fibonacci(6))  // = 8
    println(fibonacci(7))  // = 13
    println(fibonacci(10)) // = 55
}