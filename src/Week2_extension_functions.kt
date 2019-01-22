

/**
 * Things learnt in extension functions.
 * 1.Extension func are regular static function on that type.
 * 2.You will not be able to access the private member even though extension.
 * 3.You can omit this in extension func.
 **/


fun main(args:Array<String>){
    val name="karthikr"
    println("Simple extension function for string:${name.lastChar()}")
    println("Simple extension for integer for squaring:${12.square()}")
}

fun String.lastChar() = get(length-1)

fun Int.square():Int = this * this