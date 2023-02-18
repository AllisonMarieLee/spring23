fun main (){
    val number= 10
    println("Enter number between 1 through 10: $number")

    when (number){
        1 -> println("The Roman numeral version is: I")
        2 -> println("The Roman numeral version is: II")
        3 -> println("The Roman numeral version is: III")
        4 -> println("The Roman numeral version is: IV")
        5 -> println("The Roman numeral version is: V")
        6 -> println("The Roman numeral version is: VI")
        7 -> println("The Roman numeral version is: VII")
        8 -> println("The Roman numeral version is: VIII")
        9 -> println("The Roman numeral version is: IX")
        10 -> println("The Roman numeral version is: X")
        else -> println("The number is outside the range of 1 through 10.")
    }



}