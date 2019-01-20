
/**
 * Things learnt in conditionals.
 * 1.when expression with and without arguments(you can use it with boolean case).
 * 2.when analogous to switch statement.
 */
fun main(args:Array<String>){
    println("${evaluateSomething()}");
    println("${evaluateSomething(12)}")

    println("When with no arg:${whenWithNoArgument()}")
    println("When with no arg:${whenWithNoArgument(100)}")
}


fun evaluateSomething(value:Int=0):String = when(value){
    0->"value is zero"
    is Int-> "value is int"
    else -> "value is undefined"
}

fun whenWithNoArgument(value:Int=10):String = when{
    value==10-> "Value greater than 10"
    value<20->"value is less than 20"
    value==30->"value is greater than 30"
    else->"Error computing value"
}