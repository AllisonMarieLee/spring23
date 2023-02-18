fun main(){
    //A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:
    // $.10 each for less than 20 checks
    // $.08 each for 20–39 checks
    // $.06 each for 40–59 checks
    // $.04 each for 60 or more checks

    var checks= 40         // user inputs # of checks per month
    val lessThan20= .10
    val between20to39 = .08
    val between40to59 = .06
    val moreThan60 = .04

    if (checks < 20){
        val monthlyFee= (lessThan20*checks) + 10
        println("Monthly bank services fees are $$monthlyFee")}

    else if (checks >=20 && checks <=39){
        val monthlyFee= (between20to39*checks)+10
        println("Monthly bank services fees are $$monthlyFee")}

    else if (checks >=40 && checks <=59){
        val monthlyFee= (between40to59*checks)+10
        println("Monthly bank services fees are $$monthlyFee")}

    else if (checks >= 60){
        val monthlyFee= (moreThan60*checks)+10
        println("Monthly bank services fees are $$monthlyFee")}

}