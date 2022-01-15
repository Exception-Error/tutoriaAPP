package de.noctrl.kotlinbasics

fun main() {

    val arrList: ArrayList<Double> = ArrayList()
    arrList.add(5.0)
    arrList.add(3.0)
    arrList.add(12.0)
    arrList.add(7.0)
    arrList.add(1.0)

    var sum = 0.0
    for (i in arrList) {
        sum += i
    }

    var mittelWert = sum / arrList.size

    println(mittelWert)

    //Funktion addNumber mit Lambda
    val myLamda: (Int) -> Int = { s: Int -> s }
    println(addNumber(5, 10, myLamda))

    //aufruf statischer funktionen und attributen
    println(StaticTest.staticVar)
    println(StaticTest.staticFun())

    println(getNumber("test"))

}

//Beispiel Lambda
fun addNumber(a: Int, b: Int, myLambda: (Int) -> Int): Int {
    val sum = a + b
    return myLambda(sum)
}


//Exceptionhandling try-catch
fun getNumber(str:String): Int{
    return try {
        Integer.parseInt(str)
    }catch (e:ArithmeticException){
        0
    }finally {
        println("cool")
    }
}

class StaticTest() {

    //so sehen static funktionen und attribute in Kotlin aus
    companion object {

        var staticVar:Int = 1
        fun staticFun(): Int {
            return 1
        }
    }
}

class outerClass{
    //nested class = eingebettete Klasse (sind immer static). Man kann von nested class nicht auf die Sachen der outer class zugreifen
    //mit dem modifier "inner class" wird die nested zur inner class. Diese kann wie in Java auf die outer Sachen zugreifen

    //code der äußeren Klasse
    class nestedClass{
        //code der nested Klasse
    }
}


