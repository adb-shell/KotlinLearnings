/**
 * Things learnt in loops.
 * 1. for, while and do while.
 * 2. 1..9 is inclusive of upper bounds.
 * 3. until 9 omits the upper bounds.
 */


fun main(args:Array<String>){
    differentWaysForLoops()
}

fun differentWaysForLoops(){
    for(i in 1..9){
        println("The value is $i")
    }

    val stringArray = arrayOf("12","13","14","15","16","17","18")

    for((index,i) in stringArray.withIndex()){
        println("The index is $index and the value is $i")
    }

    for(i in 1 until 9){
        println("THe value is $i")
    }
}