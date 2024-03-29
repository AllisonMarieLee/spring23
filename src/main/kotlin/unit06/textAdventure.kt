fun main(){
/*  array order: (room description, north, east, south, west)
used value of -1 for no exit
index number commented on right side for easier viewing */
    val rooms = arrayOf(
        arrayOf("You are in Bedroom #2. Exits are north and east.", "3", "1", "-1", "-1"),  //[0]
        arrayOf("You are in the South Hall. Exits are north, east, and west.", "4", "2", "-1", "0"),  //[1]
        arrayOf("You are in the Dining Room. Exits are north and west.", "5", "-1", "-1", "1"),  //[2]
        arrayOf("You are in Bedroom #1. Exits are east and south.", "-1", "4", "0", "-1"),  //[3]
        arrayOf("You are in the North Hall. Exits are north, east, west, and south.", "6", "5", "1", "3"),  //[4]
        arrayOf("You are in the Kitchen. Exits are west and south.", "-1", "-1", "2", "4"),  //[5]
        arrayOf("You are on the Balcony. Exits are south.", "-1", "-1", "4", "-1")  //[6]
    )

    var currentRoom = rooms[0]   //initialize starting room
    var done = false   //set flag(done) to false

    while (done == false){
        println(currentRoom[0])    //display current room description
        println("What is your next move (n: North, e: East, s: South, w: West)? ")
        val userInput = readlnOrNull()    //accept user input
        val direction = userInput?.toLowerCase()    //convert user input to lowercase
        var nextRoom: Int = -1

        //if input is n,e,s,w then find next room in corresponding direction from current room
        when (direction) {
            "n" -> {
                nextRoom = currentRoom[1].toInt()
            } "e" -> {
                nextRoom = currentRoom[2].toInt()
            } "s" -> {
                nextRoom = currentRoom[3].toInt()
            } "w" -> {
                nextRoom = currentRoom[4].toInt()
            } else -> {
                println("Invalid. Input was not n, e, s, or w.")   //if input is not n,e,s,w then display error msg
            }
        }

        if (nextRoom == -1) {   //error msg if invalid direction
            println("You cannot go that way.")
        } else {
            currentRoom = rooms[nextRoom]
        }

        if (nextRoom == 2){   //end game when user reaches dining room
            println("You reached the Dining Room! End of Game.")
            done = true
        }
    }
}