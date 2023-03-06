fun main(){
    var sum=0

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

    for (i in 1..userInput) {
    sum+= i

    }
    println("The sum of 1 through $userInput is: " + sum)
}