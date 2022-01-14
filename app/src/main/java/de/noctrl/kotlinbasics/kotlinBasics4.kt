package de.noctrl.kotlinbasics

fun main(){
    var talha = Person("Talha","Yilmaz", 30)
    talha.setHobby("zocken")
    println("sein hobby ist ${talha.getHobby()}")

    var car1 = Car("Audi", talha)
    println("${car1.getOwnerName()} fährt einen ${car1.brand}")

}

class Person (firstName: String, lastName:String)  {
    var firstName :String? = null
    var lastName : String? = null
    var age: Int? = null
    private var hobby: String? = null

    //init wird bei Objektinitialisierung immer ausgeführt Quasi Construktorumpf
    init {
        this.firstName = firstName
        this.lastName = lastName
        println("Neue Person: $firstName $lastName wurde initialisiert")
    }

    //zweiter constructor. Bei diesem muss man den primary mit in den Kopf schreiben :this()
    constructor(firstName: String, lastName: String, age:Int) : this(firstName, lastName) {
        this.age = age

    }

    fun getHobby():String?{
        return hobby
    }

    fun setHobby(hobby:String?){
        this.hobby = hobby
    }
}

class Car (brand:String, owner:Person){
    var brand: String = brand
    get() {return field.uppercase()}
    private set

    private var owner: Person = owner

    fun getOwnerName(): String? {
        return owner.firstName
    }
}