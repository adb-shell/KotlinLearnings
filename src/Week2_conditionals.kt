
/**
 * Things learnt in conditionals.
 * 1.when expression with and without arguments(you can use it with boolean case).
 * 2.when analogous to switch statement.
 * 3.if is an expression.
 * 4. no ternary operator in kotlin.
 */
fun main(args:Array<String>){
    println("${evaluateSomething()}");
    println("${evaluateSomething(12)}")

    println("When with no arg:${whenWithNoArgument()}")
    println("When with no arg:${whenWithNoArgument(100)}")
}


fun evaluateSomething(value:Int=0):String = when(value){
    0->"value is zero"
    12-> "value is 12"
    else -> "value is undefined"
}

fun whenWithNoArgument(value:Int=10):String = when{
    value==10-> "Value greater than 10"
    value<20->"value is less than 20"
    value==30->"value is greater than 30"
    else->"Error computing value"
}