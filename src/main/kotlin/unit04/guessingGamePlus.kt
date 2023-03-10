fun main() {

    //Set range for random number
    val min = 1
    val max = 10
    val randomNumber = (Math.random() * (max - min + 1)).toInt() + min
    var guess: Int? = null
    var totalGuess = 0

    while (guess == null) {
        print("Enter a positive integer between $min and $max: ")
        val input = readLine()
        try {
            guess = input?.toInt()
            if (guess != null && (guess < min || guess > max)) {
                println("Invalid input. Please enter a positive integer between $min and $max.")
                guess = null
            }
            else{
                //Loop until user guesses it correctly
                while (guess != randomNumber) {

                    if (guess != null) {
                        if(guess > randomNumber){
                            println("Too high, try again.")
//                            println("Total Guess: " + totalGuess)
                            guess = null
                        }
                        else if (guess < randomNumber) {
                            println("Too low, try again")
//                            println("Total Guess: " + totalGuess)
                            guess = null
                        }
                    }
                    totalGuess++
//                    println("Total Guess: " + totalGuess)
                    break
                }
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer between $min and $max.")
        }
    }
    println("You guessed the number!")
    totalGuess++
    println("Total Guess: " + totalGuess)
}