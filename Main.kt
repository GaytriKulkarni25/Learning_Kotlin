
fun main() {
   println("Enter the traffic color")
    val name = readln()

    val trafficLightColor=name

    //If else

    if(trafficLightColor=="Red")
        println("Stop")
    else if(trafficLightColor=="Yellow")
        println("Slow")
    else if(trafficLightColor=="Green")
        println("Go")
    else
        println("Invalid traffic color")

    //when
    when(trafficLightColor)
    {
        "Red"-> println("Stop")
        "Yellow","Amber"-> println("Slow")
        "Green"-> println("Go")
        else-> println("Invalid traffic color")
    }

    //when with comma
    var x=1
    when(x)
    {
        2,3,5,7 -> println("x is prime number between 1 and 10")
        else -> println("x isn't a prime number between 1 and 10.")
    }


    //when with in keyword
    x=4
    when(x)
    {
        in 1..5->println("x is smaller than 5")
    }

    //when with is keyword
    val y : Any = 14
    when(y){
        is Int -> println("x is an integer number, but not between 1 and 10.")
    }

    //nullable variable
    var host : String?="Sandra"
    host=null
    println(host)

    //handle nullable variable
    //1.using safe call operator
    var z : String?="aaa"
    println(z?.length)


    //2.using not-null assertion operator
    var b : String?= "aaa"
    println(b!!.length)

    //Elvis operator
    var favoriteActor : String? = null
    val lengthOfName = favoriteActor ?. length ?:0
    println("The number of characers is $lengthOfName")



    var device= SmartDevice("Samsung Galaxy", "Mobile")

    device.turnOn()
    device.turnOff()
    device.display()

    var tv= SmartDevice("Sony", "TV")
    tv.display()

}