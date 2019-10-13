package Week4

/**
 * Things learnt in class modifiers.
 * 1. fun<T> oneHalf(value:T) value here can be nullable,
 * to make it non nullable you can add upper bound similar to ":"
 * 2. You can define multiple constraints by using ``where` keyword.
 *
 */
fun main(){
    println("NonNullable func:${someGenricFunction(10)}")
    println(someNullableGenricFunction(null))
    val sample = Sample()
    println("Function with multiple constriants: " +
            "${multipleConstaintsFunctions(sample)}")
}

interface Testinf1{
    fun toInf1()
}

interface Testinf2{
    fun toInf2()
}

class Sample:Testinf1,Testinf2{
    override fun toInf1() = println("Method o test inf1")
    override fun toInf2() = println("Method o test inf2")
}

fun <T:Number> someGenricFunction(value:T) = value.toInt()/2

fun <T> someNullableGenricFunction(value:T) = value

//function with multiple constraints TestInf1,TestInf2 can be appendable and charsequence
fun <T> multipleConstaintsFunctions(value:T) where T:Testinf1,T:Testinf2{
    value.toInf1()
    value.toInf2()
}

