package Week3

/**
 * Things learnt in nullables
 * 1.Type? to tell compiler this type can be null,
 * by default all types are not null.
 * 2.Safe access operator "?".
 * 3.else or elvis operator (?:)
 * 4.!! not null asssertion
 */
fun main(args:Array<String>){
    println("The sum length of hello and null is:${getSumLength("hello",
            null)}")
    val hello = "hello"
    var empty:String?=null
    println("The String is ${hello.isEmptyOrNull()}")
    println("The String is ${empty.isEmptyOrNull()}")
}


fun getSumLength(s1:String?,s2:String?):Int = (s1?.length?:0)+(s2?.length?:0)


fun String?.isEmptyOrNull():Boolean = this==null||length<=0