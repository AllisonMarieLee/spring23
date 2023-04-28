import kotlin.random.Random

fun main (){
    val responses= arrayOf(
        "Yes, of course!",
        "Without a doubt, yes.",
        "You can count on it.",
        "For sure!",
        "Ask me later.",
        "I’m not sure.",
        "I can’t tell you right now. I’ll tell you after my nap. No way!",
        "I don’t think so.",
        "Without a doubt, no.",
        "The answer is clearly NO.")

    do {
        //asks for user input
        println("Ask a yes or no question: ")
        val question = readLine()

        //Magic 8 Ball generates random response for user
        val index = Random.nextInt(responses.size)

        println(responses[index])

        println("Type 'q' if you are ready to quit. If not, type any OTHER letter to ask another question.")
    }
    while (readLine() !="q")
}