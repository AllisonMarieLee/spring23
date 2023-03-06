fun main(){
    val textInput = "All Hail Mary" // input text
    val text = textInput.lowercase() // make string not case-sensitive
    var charInput = 'A' // input character to search for
    var char = charInput.toLowerCase() // make character not case-sensitive
    var total = 0 // running total of char in text
    var count = 0

    //Display user input screen
    println("Enter a string: " + textInput)
    println("Enter a character: "+ charInput + "\n")

    //construct loop to calculate number
    for(count in 0..text.length - 1){
        if(text[count] == char){
            total += 1

        }

    }
    println("Total number of times that $charInput appears in the string: " + total)
}