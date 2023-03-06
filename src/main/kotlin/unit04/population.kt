fun main(){
    var organism: Double = 2.0 //enter starting number of organisms
    var percent= 50 //enter average daily population increase (as a percentage)
        val percentDouble=percent.toDouble() //convert percentage to double
        val decimal= percentDouble/100 //convert percentage to decimal format    //verified: currently prints 0.5
        val final= decimal+1
    var days= 7 //enter number of days they will multiply
    val total= 0
    var count= 0

    println("Organisms: "+ organism)
    println("Daily percent: " + percent + "%")
    println("Days: " + days +"\n")
//    println(organism * final)

    println(organism.toDouble())
    do {
        println(organism * final)
        organism = (organism * final)
        count++
    }while(count < days-1)

    println("Final: " + final)


}