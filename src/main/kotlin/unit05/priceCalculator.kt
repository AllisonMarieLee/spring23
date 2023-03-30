fun calculateRetail(cost: Double, percentage: Double): Double {

    //calculations below
    val retailCost= (cost * percentage/100.0) + cost
    return retailCost
}
fun main(){
    //asks for user input
    print("Enter item's wholesale cost: ")
    val cost= readLine()!!.toDouble()

    print("Enter markup percentage: ")
    val percentage= readLine()!!.toDouble()

    val retailCost= calculateRetail(cost, percentage)
    println("Retail cost is: $retailCost")
}

