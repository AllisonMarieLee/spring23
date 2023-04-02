fun main () {
    //asks for user input
    print("Number of shares: ")
    val numberShares = readLine()!!.toDouble()  //NS

    print("Purchase price per share: $ ")
    val purchasePrice = readLine()!!.toDouble()  //PP

    print("Purchase commission paid: $ ")
    val purchaseCommission = readLine()!!.toDouble()  //PC

    print("Sale price per share: $ ")
    val salePrice = readLine()!!.toDouble()  //SP

    print("Sale commission paid: $ ")
    val saleCommission = readLine()!!.toDouble()  //SC

    //calls the calculateStock function and prints the result
    val profitLoss = calculateStock(numberShares, purchasePrice, purchaseCommission, salePrice, saleCommission)
    println("\n" + "Stock calculation is: $$profitLoss")

    //prints whether we have profit, loss, or neither
    if (profitLoss > 0) {
        println("Profit! :D")
    } else if (profitLoss < 0) {
        println("Loss! :(")
    } else {
        println("Neither Profit or Loss :|")
    }
}

fun calculateStock(numberShares: Double, purchasePrice: Double, purchaseCommission: Double, salePrice: Double, saleCommission: Double): Double {
    //calculates profit(loss) from stock sale
    //Profit=((NS×SP)−SC)−((NS×PP)+PC)
    val saleInfo = numberShares * salePrice - saleCommission
    val purchaseInfo = numberShares * purchasePrice + purchaseCommission
    val profitLoss = saleInfo-purchaseInfo
    return profitLoss
}