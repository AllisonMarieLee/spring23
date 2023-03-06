fun main(){
    // Write a program that asks the user for a positive nonzero integer value.
    // The program should use a loop to get the sum of all the integers from 1 up to the number entered.
    // For example, if the user enters 50, the loop will find the sum of 1, 2, 3, 4, . . . 50.
//    var userInput= 5
    var sum=0
//    println("Enter a positive nonzero integer value $num")


    var userInput: Int? = null
    while (userInput == null) {
        print("Enter a positive integer: ")
        val input = readLine()
        try {
            userInput = input?.toInt()
            if (userInput != null && userInput <= 0) {
                println("Invalid input. Please enter a positive integer.")
                userInput = null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }
    println("You entered $userInput.")




    for (i in 1..userInput) {
    sum+= i

    }
    println("The sum of 1 through $userInput is: " + sum)
}