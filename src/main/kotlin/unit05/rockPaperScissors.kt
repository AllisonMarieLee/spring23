import kotlin.random.Random
fun main() {
    var playAgain = true
    while (playAgain) {
        //calls on the Game Rules Function to print
        val gameRules = printGameRules()                       //********this function working fine
        println(gameRules)

        var result: String
        do {
            val userDecision = getPlayerAnswer()                      //this line is good
            val cpu = cpuAnswer()                      //this line is good
            println("CPU answer was $cpu")

            result = determineGameResult(userDecision, cpu)
            println(result)
        } while (result == "Tie")

        if (result != "Tie") {
            print("Do you want to play again? (y/n): ")
            val decision = readLine()!!.toLowerCase()
            playAgain = decision == "y"
        }
    }
}


    //Game Rules Function
fun printGameRules(): String {                              //********this function working fine
    val gameRules = "Rules of the game: \n" + "Rock=1\n" + "Paper=2\n" + "Scissors=3\n" + "-------------------"
    return gameRules
}

fun getPlayerAnswer(): Int {
    //asks for user input
    print("Choose 'Rock (1)', 'Paper (2)', or 'Scissors (3)': ")
    val userDecision = readLine()!!.toInt()
    if (userDecision < 1 || userDecision > 3) {
        print("Answer is invalid.")
        return -1
    }
    return userDecision
}

    //Generate a random answer for the CPU (computer opponent) and return the value as an integer
fun cpuAnswer(): Int {
    //if randomNumber is 1=ROCK, 2=PAPER, 3=SCISSOR
    val randomNumber = Random.nextInt(1, 4)
    return randomNumber
}

fun determineGameResult(getPlayerAnswer: Int, cpuAnswer: Int): String {
    return when {
        (getPlayerAnswer == 1 && cpuAnswer == 3) || (getPlayerAnswer == 2 && cpuAnswer == 1) || (getPlayerAnswer == 3 && cpuAnswer == 2) -> {
            "You Win! \n"
        }
        (getPlayerAnswer == 1 && cpuAnswer == 2) || (getPlayerAnswer == 2 && cpuAnswer == 3) || (getPlayerAnswer == 3 && cpuAnswer == 1) -> {
            "You Lose! \n"
        }
        (getPlayerAnswer == cpuAnswer) -> {
            "Tie! \n"
        }
        else -> {
            "Invalid \n"
        }
    }
}