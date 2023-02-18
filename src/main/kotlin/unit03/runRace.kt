import jdk.swing.interop.LightweightFrameWrapper

fun main(){
    var name1= "Jennifer"
    var name2= "Betty"
    var name3= "Allison"

    var time1= 12
    var time2= 15
    var time3= 10
    println("Enter names of three runners and time (minutes) to finish race. \n" +
            "1st Runner Name: $name1 \n" + "1st Runner time: $time1 \n\n" +
            "2nd Runner Name: $name2 \n" + "2nd Runner time: $time2 \n\n" +
            "3rd Runner Name: $name3 \n" + "3rd Runner time: $time3 \n\n")

    if (time1 < time2 && time2 < time3) //tested output- looks good
        print("Order of fastest:\n" +
                "$name1 \n" +
                "$name2 \n" +
                "$name3\n")
    else if (time1 < time3 && time3 < time2) //tested output- looks good
        print("Order of fastest:\n" +
                "$name1 \n" +
                "$name3 \n" +
                "$name2\n")
    else if (time2 < time1 && time1 < time3) //tested output- looks good
        print("Order of fastest:\n" +
                "$name2 \n" +
                "$name1 \n" +
                "$name3\n")
    else if (time2 < time3 && time3 < time1) //tested output- looks good
        print("Order of fastest:\n" +
                "$name2 \n" +
                "$name3 \n" +
                "$name1\n")
    else if (time3 < time1 && time1 < time2) //tested output- looks good
        print("Order of fastest:\n" +
                "$name3 \n" +
                "$name1 \n" +
                "$name2\n")
    else if (time3 < time2 && time2 < time1) //tested output- looks good
        print("Order of fastest:\n" +
                "$name3 \n" +
                "$name2 \n" +
                "$name1\n")
}