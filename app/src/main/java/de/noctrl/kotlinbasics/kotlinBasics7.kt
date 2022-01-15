package de.noctrl.kotlinbasics

import kotlin.math.floor

fun main() {
    val strings: List<String> = listOf("Tobias", "Emma", "Max") // List<String>
    val mixed: List<Any> = listOf("Tobias", 78, "KM", "Hallo", 48.4, 25, 13.32F) // List<Any>

    for (value in mixed){
        if (value is Int){
            println("Integer: $value")
        } else if (value is Double){
            println("Double: $value abgerundet auf ${floor(value)}")
        } else if (value is String){
            println("String: $value mit der Länge ${value.length}")
        } else {
            println("Unbekannter Typ")
        }
    }

    // Alternative
    for (value in mixed) {
        when(value){
            is Int -> println("Integer: $value")
            is Double -> println("Double: $value abgerundet auf ${floor(value)}")
            is String -> println("String: $value mit der Länge ${value.length}")
            else -> println("Unbekannter Typ")
        }
    }

    // Typ-Umwandlung
    val obj1: Any = "Hallo Welt"
    if (obj1 !is String){
        println("Kein String")
    } else {
        println("String mit der Länge ${obj1.length} gefunden")
    }

    // Explizite (unsichere) Umwandlungsart durch das "as" Keyword -> Kann schief gehen
    val str1: String = obj1 as String
    println(str1.length)

    val obj2: Any = 1338
    val str2: Int = obj2 as Int
    println(str2)

    // Sichere Variante mit String? und as? -> Nullable
    val obj3: Any = 1338
    val str3: Int? = obj3 as? Int
    println(str3)
}