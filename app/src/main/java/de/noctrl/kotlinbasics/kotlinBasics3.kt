package de.noctrl.kotlinbasics

import java.lang.reflect.Array.get

fun main() {
    val p1 = Person("Talha", "Yilmaz")
    val phone1 = Smartphone("Samsung", "Galaxy Note 20","Android")
    val phone2 = Smartphone("Huawei", "P40 Pro","Android")
    val phone3 = Smartphone("Apple", "iPhone 13", "iOS")

}

class Person(firstName: String, lastName: String) {
//wenn mehr als ein constructor benötigt dann: constructor (firstName:String, lastName: String) im Klassenrumpf
    private var firstName: String
    private var lastName: String

    init {
        this.firstName = firstName
        this.lastName = lastName
        println("Neue Person erstellt. \n Vorname: $firstName \n Nachname: $lastName \n")
    }

    fun getFirstName():String {
        return firstName
    }

}

class Smartphone( marke: String, modell: String, betriebsystem: String) {

    private var marke: String
    private var modell: String
    private var betriebsystem: String

    init {
        this.marke = marke
        this.modell = modell
        this.betriebsystem = betriebsystem


        println("Marke: $marke\nModell: $modell\nBetriebsystem: $betriebsystem\n")
    }
}