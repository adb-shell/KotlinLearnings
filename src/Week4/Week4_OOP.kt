package Week4

/**
 * Things learnt in object oriented programming.
 * 1.public private and internal.
 * 2 public and final are used as defaults.
 *
 * --------     ------------   ---------------------
 * modifier     class member   Top level declaration
 * --------     ------------   ---------------------
 *
 *1.public      -------------everywhere-------------
 *2.internal    -----------visible in module--------
 *3.protected   subclass only  ----------------------
 *4.private     class only     file only.
 *
 *3.primary constructor(next to name of class) vs secondary construtor in kotlin
 *4.init { } represents constructors body.
 *5.secondary constructor must call primary constructor.
 *6.enum class same enum in java can have constructor and members.
 *7.data class equals(),toString() hashCode() and copy methods are generated under the hood.
 * normal classes check for reference equality (=== can be used for ref).
 *8.
 */
fun main(args:Array<String>){
    val a = A("h1")
    a.h1()
    println(a.name)
    println(Color.BLUE.getRGB())
}

class A(var name:String){

    init {
        name+="Mr"
    }

    internal fun h1(){
        println("hello")
    }
}

/**
 * enums can have constructors and member functions.
 */
enum class Color(val r:Int,val g:Int,val b:Int){
    BLUE(0,1,2),RED(0,1,1),GREEN(0,1,3);

    fun getRGB():Int = r+g*b
}