fun main() {
//     var minNumStores= 0
    var numOfStores= 5
    val hundred= 100
    var star= 0

    var store1: Int
    var store2: Int
    var store3: Int
    var store4: Int
    var store5: Int

    //User input that asks for today's sales for 5 stores
    println("Enter today's sales for 5 stores.")
    print("Store 1: ")  // 1000
        store1 = readLine()!!.toInt()

    print("Store 2: ")  // 1200
        store2 = readLine()!!.toInt()

    print("Store 3: ")  // 1800
        store3 = readLine()!!.toInt()

    print("Store 4: ")  // 800
        store4 = readLine()!!.toInt()

    print("Store 5: ")  // 1900
        store5 = readLine()!!.toInt()

    //
    var store1Hundred= store1/hundred
    var store2Hundred= store2/hundred
    var store3Hundred= store3/hundred
    var store4Hundred= store4/hundred
    var store5Hundred= store5/hundred

    //STORE 1
    print("\n Store 1: ")
      while (star < store1Hundred){
     print("*")
     star++
     }

//    print("$star \n")

    //STORE 2
    star = 0
    print("\n Store 2: ")
    while (star < store2Hundred){
        print("*")
        star++
    }
//    print("$star \n")

    //STORE 3
    star = 0
    print("\n Store 3: ")
    while (star < store3Hundred){
        print("*")
        star++
    }

    //STORE 4
    star = 0
    print("\n Store 4: ")
    while (star < store4Hundred){
        print("*")
        star++
    }

    //STORE 5
    star = 0
    print("\n Store 5: ")
    while (star < store5Hundred){
        print("*")
        star++
    }
}