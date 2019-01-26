package Week2

/**
 * Things learnt in extension functions and standard lib.
 * 1.Extension func are regular static function on that type.
 * 2.You will not be able to access the private member even though extension.
 * 3.You can omit this in extension func.
 * 4.`Infix` functions for which we can omit parenthisis.
 * 5.member vs extension function `member` always wins.
 **/


fun main(args:Array<String>){
    val name="karthikr"
    val last = "karthir"

    println("Simple extension function for string:${name.lastChar()}")
    println("Simple extension for integer for squaring:${12.square()}")
    println("Simple infix extension function:${name EQUALS last}")
}

fun String.lastChar() = get(length-1)

fun Int.square():Int = this * this

infix fun String.EQUALS(value:String) = get(length-1)== value[value.length-1]