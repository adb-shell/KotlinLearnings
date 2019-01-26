package Week2
/**
 * Things learnt in `in` and ranges.
 * 1.iteration and belonging usage for in.
 */
fun main(args:Array<String>){
    println("The value is not in range  ${inInsideWhen("10")}")
    println("The value is in range  ${inInsideWhen("12")}")

    println("The value is Alphabet:${isAlphabet('c')}")
    println("The value is Alphabet:${isAlphabet('1')}")
}


//belonging usages
fun inInsideWhen(value:String):Boolean {
    val array = arrayOf("12","13","14","15","16")
    return value in array
}

fun isAlphabet(value:Char):Boolean = value in 'a'..'z'