

/**
 * Things learnt in functions.
 * 1.Convert function to function with expression expressionBody
 * 2.Omit return types expression expressionBody func if it is private.
 * 3.By default func returns Unit(if return type not specified.)
 * (equivalent to void in java)
 * 4.Functions everywhere(top-level,member and also local)
 * 5.You can change how java calls top level kotlin function
 * <b>@file:@jvmname("name you want it in java")</b>(check java interop-package)
 * but should be above package declaration.
 * 6.Repeat operator in kotlin.
 * 7.Changing the order of default args in kotlin.
 * 8.@JvmOverloads() usage to utilize default args in kotlin
 **/


fun main(array: Array<String>){
    print("The value is ${mainExpBody(12)}")
    expressionBody()
    localFunctionExample()

    //default args
    repeatOpeartor()
    repeatOpeartor(5)
    repeatOpeartor(2,"sample")

    //changing the order of args using named args
    repeatOpeartor(printingstring = "hello",times = 2)
}

fun mainExpBody(exp:Int):Boolean = exp>10

fun expressionBody() = println("This func returns Unit")

//func inside a func(local func)
fun localFunctionExample(){
    fun sample() = println("This is printing from local func")
    sample()
}

fun repeatOpeartor(times:Int=1,printingstring:String="temp"){
    repeat(times){
        println("$printingstring will be repeating $times times")
    }
}