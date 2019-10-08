package Week4
/**
 * Things learnt in class modifiers.
 * 1.`Enum` enumerated types.
 * 2.`Data` class that overrides equals hash.
 * 3.`Sealed` modifier getting rid of else in switch.
 * 4.`Inner` classes only to access the outer class fields.
 * similar to our view holder concepts.
 * 5.Class delegation by using by key words
 *
 */
fun main(){
        println(evaluate(Expression.Plus(2,4)))
        println(evaluate(Expression.Minus(8,4)))

        val randomController = randomController(ss1(),ss2())
        randomController.method12()
        randomController.method13()
        randomController.method21()
        randomController.method23()
}

//here when is not exhaustive.
fun evaluate(expression: Expression):Int{
    return when(expression){
        is Expression.Plus->{
            expression.a+expression.b
        }
        is Expression.Minus->{
            expression.a-expression.b
        }
    }
}

//basically restricts the hierarchy
sealed class Expression{
    data class Plus(val a:Int,val b:Int):Expression()
    data class Minus(val a:Int,val b:Int):Expression()
}

/**
 * Class delegation by example and how it is made easy in kotlin.
 */
interface sample1{
    fun method12()
    fun method13()
}

interface sample2{
     fun method21()
     fun method23()
}

class ss1:sample1{
    override fun method12() = println("method12")
    override fun method13() = println("method13")
}

class ss2:sample2{
    override fun method21() = println("method21")
    override fun method23() = println("method23")
}

//class responsible for delegation
class randomController(s1: sample1,
                       s2: sample2):sample1 by s1,sample2 by s2