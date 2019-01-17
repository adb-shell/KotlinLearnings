/**
 * Things learnt in simple hello world program.
 *
 * 1.functions can be defined as top most.
 * 2.Arrays in kotlin
 * 3.how to return pair(via deconstruction)
 * 4.String literals and functions in String literals.
 * 5.if is an expression.
 */

//array is similar to collections
fun main(args:Array<String>){
    val templating = "string templating"
    println("This is $templating")
    println("This is Advanced $templating ${callingfunctionInStringTemplates()}")
    doSomething(13)

    //if is an expression
    val result = if (callingfunctionInStringTemplates()>12) "hello" else "world"
    println("The result is $result")
}

fun doSomething(degree:Int) {
    val (color,type) = when{
        degree<5 -> Pair("cold","freeze")
        degree>15 -> Pair("red","hot")
        else -> Pair("warm","breeze")
    }
    println("color is $color and type is $type")
}

fun callingfunctionInStringTemplates():Float{
    val dosomething = 50+62
    return dosomething/12f
}