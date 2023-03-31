fun main(){
    //loop from 1-10
    var time = 1.0
    while (time <= 10.0) {
        val distance = fallingDistance(time.toDouble())
        println("Time(sec): $time, Distance(meter): $distance")
        time++
    }
}

fun fallingDistance(time: Double): Double {
    //d=1/2(gt^2) formula, d=distance(meters), g=9.8, t=time(seconds--from user input)
    val exponent=2.0
    val result=Math.pow(time, exponent)
    val distance: Double= 0.5*(9.8 * result)
    return distance
}