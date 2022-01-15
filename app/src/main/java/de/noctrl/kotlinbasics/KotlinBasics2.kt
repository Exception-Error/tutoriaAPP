package de.noctrl.kotlinbasics
@SuppressWarnings
fun main() {
    //NULLABLES
    println("NULLABLES------------------------------------------------------------------------------")
    var name: String = "Talha"
    //name = null   |   compiler Error
    var nullName: String? = null

    var lange = name.length
    //var lange2 = nullName.length  |    da nullName null sein könnte gibt es compiler error
    var lange2 = nullName?.length
    // das ? ist eine abfrage ob !null. Wenn true dann wird (hier) .length ausgeführt
    println(nullName?.length)
    nullName?.let { println(it.length) }  //keine Ahnung was .let macht -> Lambda glaub ich

    // ?: ELVIS OPERATOR wandelt nullable String (also String?) in normalen
    var newName = nullName ?: "gast"
    println("Hallo $newName")

    // !! NOT-NULL-ASSERTION
    var nullAge: Int? = 32
    var age: Int = nullAge!!
    nullAge!!.compareTo(4)
    println(age)

}