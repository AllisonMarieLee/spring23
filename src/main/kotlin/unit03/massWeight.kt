fun main(){
    //Weight=Mass×9.8
    var mass= 2
    val weight= mass * 9.8

    println("Weight is $weight") // I know we don't need to display calc but I like to see the result :D
    if (weight>1000)
        print("Too heavy")
    else if (weight<10)
        print("Too light")
}