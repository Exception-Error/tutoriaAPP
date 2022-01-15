package de.noctrl.kotlinbasics

// Eine abstrakte Klasse kann nicht instanziiert (geladen) werden
// (Du kannst keine Objekte einer abstrakten Klasse erstellen)
// Die Eigenschaften und MEthoden einer abstrakten Klasse sind nicht abstrakt,
// solange du sie nicht explizit mit dem "abstract" keyword zu einer abstrakten Eigenschaft oder
// Methode machst.

abstract class Mammal(val name: String, val origin: String,
                      val weight: Double) {   // Konkrete (nicht abstrakte) Eigenschaften

    // Abstrakte Eigenschaft (muss von Subklassen überschrieben werden)
    abstract var maxSpeed: Double

    // Abstrakte Methode (muss von Subklassen implementiert werden)
    abstract fun run()
    abstract fun breath()

    // Konkrete (nicht abstrakte) Methode
    fun displayDetails() {
        println("Name: $name, Herkunft: $origin, Gewicht: $weight, " +
                "Max Geschwindigkeit: $maxSpeed")
    }
}

class Human(name: String, origin: String, weight: Double,
            override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // Code für "run"
        println("Läuft auf zwei Beinen")
    }

    override fun breath() {
        // Code für "breath"
        println("Atmen durch Mund oder Nase")
    }
}

class Elephant(name: String, origin: String, weight: Double,
               override var maxSpeed: Double): Mammal(name, origin, weight) {

    override fun run() {
        // Code für "run"
        println("Läuft auf vier Beinen")
    }

    override fun breath() {
        // Code für "breath"
        println("Atmet durch den Rüssel")
    }
}

fun main() {
    val human = Human("Denis", "Russia",
        70.0, 28.0)
    val elephant = Elephant("Rosy", "India",
        5400.0, 25.0)

    human.run()
    elephant.run()

    human.breath()
    elephant.breath()

}