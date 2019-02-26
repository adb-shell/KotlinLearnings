package Week4

/**
 * Things learnt in lazy intialization.
 * 1.by lazy will be computed only once, and only if needed.
 * 2.late init will always non nullable, cannot be val. cannot be primitive type.
 * 3.::variable.isIntialized() to check for intialization.
 */

val myval: String by lazy{
    println("intializing")
    "hello"
}

fun main(args:Array<String>){
    println(myval)
    println(myval)
}