package de.noctrl.tutoriaapp

fun main() {
/*
    //RUMSPIELEN MIT VARIABLEN VON BASIC DATATYPES
    println("RUMSPIELEN MIT VARIABLEN VON BASIC DATATYPES-------------------------------------------")
    val name = "Talha"
    var alter: Int
    val myByte: Byte = 30
    val myDouble: Double = 30.0

    alter = myByte.toInt()

    var myBool = true
    var char = 'q'
    var test = "2"
    var test2 = test.toInt()
    var nameArr = name.toCharArray()
    val arr = arrayOf("eins", "zwei", "drei")

    println("$name ist $alter Jahre alt")
    for (item in arr){
        print("$item, ")
    }
    println(arr[arr.size-1])
    println(name.length)

    //VERGLEICHSOPERATOREN
    println("\nVERGLEICHSOPERATOREN-----------------------------------------------------------------")
    var isEqual = 5==3 //simplyfy boolean expression
    isEqual = alter == name.length
    println("Ist 5 größer 3? Antwort ${5>3}")

    //ZUORDNUNGSOPERATOREN
    println("\nZUORDNUNGSOPERATOREN-----------------------------------------------------------------")
    var nummer = 4
    nummer+=3
    println(nummer)
    nummer*=7
    println(nummer)
    nummer++
    println(nummer)
    println("meine nummer ist die ${nummer++}")
    println("meine nummer ist die ${++nummer}")

    //IF ABFRAGEN
    println("\nIF ABFRAGEN--------------------------------------------------------------------------")
    var age = 30
    if (age >= 18) {
        println("Du darfst auto fahren")
    } else if (age >= 17) {
        println("Du darfst begleitet fahren")
    } else if (age >= 16) {
        println("Du darfst den führerschein beginnen")
    }else{
        println("Du bist zu jung")
    }

    var season = 2
    when(season){
        1 -> println("Frühling")
        2 -> println("Sommer")
        3 -> println("Herbst")
        4 -> println("Winter")
        else -> println("ungültig")
    }
    // When in Java wie Switch

    var month = 7
    when(month) {
        1,2,3 -> println("Frühling")    // das gleiche wie: in 1..3 ->
        in 4..6 -> println("Sommer")
        in 7..9 -> println("Herbst")
        in 10..12 -> println("Winter")
        else -> println("ungültig")
    }

    var x: Any = 14.45F
    when(x){
        is Int -> println("$x ist ein integer")
        is Double -> println("$x ist ein Double")
        is Float -> println("$x ist ein Float")
        else -> print("triff auf keins zu")
    }
*/
    //WHILE SCHLEIFEN
    println("\nWHILE SCHLEIFEN----------------------------------------------------------------------")
    var y = 1
    while(y <=10){

        print("${y++}, ")

    }
}