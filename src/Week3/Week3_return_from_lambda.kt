

/**
 * Learnings from return from lambda.
 * 1. return always returns from function marked as fun.
 * 2. labeled return `return @label returntype`
 */

fun main(args:Array<String>){
    println(doSomething())
    println(doSomething1())
}

//normal return
fun doSomething():Boolean{
    val numbers = mutableListOf(12,13,0,15,16,17)
    numbers.forEach {
        if(it==0) return true
    }
    return false
}

//labelled return
fun doSomething1():List<Int>{
    val numbers = mutableListOf(12,13,0,15,16,17)
    return numbers.flatMap {
        if(it==0)
            return listOf<Int>()
        return listOf(it)
    }
}