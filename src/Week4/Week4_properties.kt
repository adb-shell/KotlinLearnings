package Week4

import kotlin.random.Random

/**
 * Things learnt in properties in kotlin.
 * 1.Getters and setters will be called under the hood
 * but in java we need to call getters and setters
 * 2.val (immutable)---->only getter will be generated
 *   var (mutable)------>getter and setter will be generated.
 * 3.Define getters without having field to store the value.
 * 4.You can also define extension properties like functions
 * but prefixed val/var
 */
fun main(args:Array<String>){
    val person = Person("nadl")
    println(person.address)
    println(person.isEmpty)
    println(person.getType)
}

data class Person(val address:String){
    val isEmpty: Boolean get(){ return address.isNullOrEmpty() }
    fun getRandom() = Random(10)
}

val Person.getType:Char get()=address[0]

/**
 * variable name is open and smart cast is not possible
 */
interface human{
    val name:String
}

/**
 * Extension properties.
 */
val String.getIndices:Char get() = this[0]