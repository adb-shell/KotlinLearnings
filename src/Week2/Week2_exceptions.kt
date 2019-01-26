package Week2

import java.lang.IllegalStateException

/**
 * Things learnt in Kotlin exceptions.
 * 1. There is checked exceptions unlike java.
 * 2. Throw, try catch are expressions means value can be assigned.
 * 3.@Throws annotation for java code.
 **/

fun main(args:Array<String>){
    println("This is an example:${sampleExceptionExample("a")}")

    println("This will throw:${sampleExceptionExample("$$$")}")
}


fun sampleExceptionExample(value:String):Boolean{
    return if(value in "abc".."xyz") return true
                else throw IllegalStateException("Not alphabet")
}

/**
 * For java compatibility else you cannot surround it by try catch
 * in java if function does not throw exceptions.
 */
@Throws(IllegalStateException::class)
fun forJavaCompliance(){
    throw IllegalStateException()
}