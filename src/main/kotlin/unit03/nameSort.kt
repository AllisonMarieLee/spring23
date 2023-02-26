fun main(){

    var name1="Leslie"             //user inputs 3 names
    var name2="Charlie"
    var name3="Andy"

    println("Enter 3 names below \n" +
            "Name 1: $name1 \n" +
            "Name 2: $name2 \n" +
            "Name 3: $name3")

    if((name1.compareTo(name2) < 0) && (name1.compareTo(name3) < 0))
    {println("\n$name1")
        if (name2.compareTo(name3)<0)
        {
            println("$name2 \n$name3")
        }

        else
        {
            println("$name3 \n$name2")
        }
    }


    else if((name1.compareTo(name2) > 0) && (name2.compareTo(name3) < 0))
    {println("\n$name2")
        if (name1.compareTo(name3)<0)
        {
            println("$name1 \n$name3")
        }

        else
        {
            println("$name3 \n$name1")
        }
    }


    else
    {println("\n$name3")
        if (name1.compareTo(name2)<0)
        {
            println("$name1 \n$name2")
        }

        else
        {
            println("$name2 \n$name1")
        }
    }

}