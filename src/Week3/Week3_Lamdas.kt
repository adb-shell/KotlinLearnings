package Week3


/**
 * Things learnt about lamdas in kotlin
 * 1.Lamdas always inside { }
 * 2.If last arg is Lamda then you can omit ()
 * eg: math{x:Int->x*x}
 * 3.replace unused arg with _
 * 4.If there is only one lamda arg you can omit it
 * and refer it using `it`
 * 5.Learn the library and try to reuse if possible
 * 6.destructing syntax for lambdas, when more than one params.
 * {(key,value)-> "$key is $value"}
 */
fun main(args:Array<String>){
    mutableListOf(1,2,3,4,5,6,7,8,9,0)
            .filter {
                it%2==0
            }.map {
                println("The filtered values are:$it")
            }


    val (first,second) = mutableListOf(1,2,3,4,5,6,7,8,9,0)
            .partition {
                it%2==0
            }

    for(value in first){
        println("Value in first:$value")
    }

    for(value in second){
        println("Value in second:$value")
    }


    mutableListOf(Person("abc",12,"kjsd"),
                  Person("xyz",12,"kajs"),
                  Person("abc",22,"asjhd"),
                  Person("mno",20,"kjsd"))
            .groupBy {
                it.address
            }
            .map {
                println("Grouping by ${it.key}")
                for (item in it.value){
                    println("THe values are:$item")
                }
            }


    println("All the items are greater than 0:${mutableListOf(12,11,10,9).all { it>0 }}")
    println("Any the item are less than 10:${mutableListOf(12,11,10,9).any{ it<10 }}")
}


data class Person(val name:String,val age:Int,val address:String)