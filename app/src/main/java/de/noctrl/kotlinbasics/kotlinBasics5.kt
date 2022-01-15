package de.noctrl.kotlinbasics

fun main() {
    /*
    var user1 = User(1, "Talha")
    var user2 = User(2, "Furkan")

    println(user1.equals(user2)) //oder auch
    println(user1 == user2)

    println(user1) //bei einer data class werden die Parameter(komponenten) als String ausgegeben

    val user3 = user1.copy(id = 3)
    println(user3.component2())

    val (id, name) = user3
    */

    var name : Any //Jede Klasse erbt von Any (Java equivalent zu Object)
    var car1 = Auto("S4", "AUDI", 260.00)
    var car2 = EAuto("Prototyp", "TOGG", 300.0, 500.00)

    car1.extendRange(200.0)
    car2.extendRange(100.0)

    println(car1.range)
    println(car2.range)

    car1.drive()
    car2.drive()
    car2.brake()

}

open class Auto(name: String, brand: String, override val maxSpeed: Double): Drivable {
    open var range: Double = 0.0

    fun extendRange (amount: Double){
        if (amount > 0) {
            range += amount
        }else{
            throw IllegalArgumentException("Reichweite muss größer als 0 sein!")
        }
    }

    open fun drive(distance: Double){
        println("$distance KM gefahren")
    }

    override fun drive(): String {
        println("gefahrene KM: $range")
        return range.toString()
    }
}

class EAuto(name: String, brand: String, maxSpeed: Double, battery: Double ) : Auto(name, brand, maxSpeed) {

    override var range = battery * 6

    override fun drive(distance: Double) {                      //Funktion(methode) überschreiben
        println("Elektisch gefahrene distanz $distance KM")
    }

    override fun drive():String{
        println("gefahrene elektrische KM: $range")
        return range.toString()
    }
}

interface Drivable {
    val maxSpeed: Double
    fun drive(): String
    fun brake(){
        println("bremst")
    }
}

data class User(val id: Long, val name: String)

