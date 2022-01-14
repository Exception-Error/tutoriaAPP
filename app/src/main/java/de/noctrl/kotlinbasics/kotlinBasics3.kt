package de.noctrl.kotlinbasics

import java.lang.IllegalArgumentException
import java.lang.reflect.Array.get

fun main() {
    val p1 = Personn("Talha", "Yilmaz")
    val phone1 = Smartphone("Samsung", "Galaxy Note 20", "Android", 150)
    val phone2 = Smartphone("Huawei", "P40 Pro", "Android")
    val phone3 = Smartphone("Apple", "iPhone 13", "iOS")

    phone1.ladeAkku()

}

class Personn(firstName: String, lastName: String) {
    //wenn mehr als ein constructor benötigt dann: constructor (firstName:String, lastName: String) im Klassenrumpf
    private var firstName: String
    private var lastName: String

    init {
        this.firstName = firstName
        this.lastName = lastName
        println("Neue Person erstellt. \n Vorname: $firstName \n Nachname: $lastName \n")
    }

    fun getFirstName(): String {
        return firstName
    }

}

class Smartphone(marke: String, modell: String, betriebsystem: String) {

    var marke: String = marke
    var modell: String = modell
    var betriebsystem: String = betriebsystem
    var akku : Int = 0

    init {

        println("Marke: $marke\nModell: $modell\nBetriebsystem: $betriebsystem\n")
    }

    constructor(marke: String, modell: String, betriebsystem: String, akku: Int) : this(marke, modell, betriebsystem){
        this.akku= akku
        if (akku <0) throw IllegalArgumentException("Akku kann nicht unter 0 sein")
        if (akku > 100) this.akku =100
    }

    fun ladeAkku(){
        println("Aktueller Akkustand: $akku%\nläd...\nläd...\nläd...")
        println("Akku um 30% geladen")
        akku+=30
        if (akku>=100) akku=100
        println("Neuer Akkustand: $akku%")
    }
}