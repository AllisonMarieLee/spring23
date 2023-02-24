fun main() {
    var vegetarian = "yes"
    println("Vegetarian? $vegetarian")

    var vegan = "no"
    println("Vegan? $vegan")

    var glutenFree = "yes"
    println("Gluten-Free? $glutenFree")

    if (vegetarian == "yes"){
        if (vegan == "yes")
            if (glutenFree == "yes" || glutenFree == "no")
                println("Corner Cafe, Chef's Kitchen")
        if (vegan=="no")
            if (glutenFree=="yes")
                println("Main Street Pizza Company, Corner Cafe, The Chef's Kitchen")
            else
                println("Main Street Pizza Company, Corner Cafe, Mama's Fine Italian, The Chef's Kitchen")}
    if (vegetarian == "no"){
        if (vegan == "yes")
            if (glutenFree=="yes" || glutenFree=="no")
                println("Corner Cafe, The Chef's Kitchen")
        if (vegan=="no")
            if (glutenFree=="yes")
                println("Main Street Pizza Company, Corner Cafe, The Chef's Kitchen")
            else if (glutenFree=="no")
                println("Joe's Gourmet Burgers, Main Street Pizza Company, Corner Cafe, Mama's Fine Italian, The Chef's Kitchen")}
}
