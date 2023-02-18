
import kotlin.math.*
fun main(){
//BMI=Weight x 703/(Height^2)

    var weight= 98        //pounds
    var height= 60        //inches
    println("Enter weight(lbs): $weight")
    println("Enter height(inches): $height")

    val exponent= 2
    val BMI= weight * 703/Math.pow(height.toDouble(), exponent.toDouble())

    println("BMI is $BMI")

    when (BMI){
        in 18.5..25.0 -> println("Optimal")
    else -> if (BMI < 18.5)
        println("Underweight")
    else
        print("Overweight")}


}