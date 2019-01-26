package Week2

/**
 * Things learnt in variables.
 * 1. diff between listOf() mutableListOf()
 * 2. val is not immutable.
 * 3. var vs val.
 * 4. prefer val over var close to func(hence can be read).
 **/

fun main(args:Array<String>){
    val mutableInVal = MutableInVal()
    mutableInVal.helloworld = "hi"
    println("The value is changed:${mutableInVal.helloworld}")
}


class MutableInVal{
    var helloworld = "hello"
}