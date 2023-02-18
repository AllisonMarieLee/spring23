fun main(){
    var month=6
    var day=10
    var twoDigitYear=60
    println("Enter month (numerical): $month")
    println("Enter day: $day")
    println("Enter 2 digit year: $twoDigitYear")

    if (month*day==twoDigitYear)
        println("The date is magic!")
    else
        println("The date is NOT magic.")

}