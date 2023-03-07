fun main(){
    //                                                READ ME!!!
    //PROFESSOR: They are outputting as decimals. Seems like organisms would grow in whole numbers but
    //instructions did not mention anything so I left them as they are. Wasn't sure if it didn't matter for the
    //purposes or scope of the lesson. Another thing to note, let's say starting organism size is 2 and the growth
    //percentage was 50%. I wasn't sure if Day 1 would start at 2 or if Day 1 would start at 3 (because by end of
    //day there would be 3). I decided to code based on the latter.

    var organism: Double? = null // Double = 2.0 //enter starting number of organisms
    var percent: Int? = null //= 50 //enter average daily population increase (as a percentage)
    var days: Int? = null //enter number of days they will multiply
    val total= 0
    var count= 0
    var countLabel= count+1

    //input validation for 'organism'- does not accept number lass than 2 for starting size of the population.
    while (organism == null) {
        print("Enter a starting size of the population greater than 1: ")
        val input = readLine()
        try {
            organism = input?.toDouble()
            if (organism != null && organism < 2) {
                println("Invalid input. Please enter a number greater than 1.")
                organism = null
            }
        } catch (e: Exception) {
            println("Invalid input. PPlease enter a number greater than 1.")
        }
    }

    //input validation for 'percentage'- does not accept negative number for the average daily population increase.
    while (percent == null) {
        print("Enter a percentage for the average daily population increase: ")
        val input = readLine()
        try {
            percent = input?.toInt()
            if (percent != null && percent< 0) {
                println("Invalid input. Please enter a positive number.")
                percent= null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a positive integer.")
        }
    }

    //input validation for 'days'- does not accept a number less than 1 for the number of days they will multiply.
    while (days == null) {
        print("Enter number of days: ")
        val input = readLine()
        try {
            days = input?.toInt()
            if (days != null && days< 1) {
                println("Invalid input. Please enter a number greater than 0.")
                days= null
            }
        } catch (e: Exception) {
            println("Invalid input. Please enter a number greater than 0")
        }
    }

//    println(percent/100.0)
//    println((1 + (percent/100.0)))

    do {
        if (organism != null) {
            println("Day $countLabel: " + organism * (1 + (percent/100.0)))
            organism = (organism * (1 + (percent/100.0)))
            count++
            countLabel++
        }

    }while(count < days)
}