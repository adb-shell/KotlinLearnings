package Week3


/**
 * Things learnt in function types.
 * 1. store lambda in variable but not function in variable.
 * but however you can store its reference(member references).
 * 2. Nullable functions types as shown in func3.
 * 3. pass function as a reference whenever lambda grows.
 * 4. bounded vs unbounded reference.
 */
fun main(args:Array<String>){

    //weired but possible.
    val func1 = { println("Hello")}()

    println(func1)

    //another version would be that is readable.
    val func2 = run{ println("Hello World")}
    println(func2)

    //whole of func3 can be nullable.
    var func3:((Int)->Boolean)?=null

    println(func3)
    func3 = {i->i>0}
    println(func3?.invoke(12))

    fun smallFunction(){
        println("Printing inside small functions")
    }

    //bounded ref
    println(::smallFunction.invoke())

    //un bounded ref
    val model = Model("example name")
    println(model::getModelName.invoke())
}


data class Model(val modelname:String="default name"){
    fun getModelName():String = "$modelname This is from Model class"
}