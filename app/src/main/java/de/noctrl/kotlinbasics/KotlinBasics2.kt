package de.noctrl.kotlinbasics

fun main() {
    var name: String = "Talha"
    //name = null      compiler Error
    var nullName: String? = "Talha"

    var lange = name.length
    //var lange2 = nullName.length   da nullName null sein könnte gibt es compiler error
    var lange2 = nullName?.length
    print("nib")
}