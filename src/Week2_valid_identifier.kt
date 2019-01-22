/**
 * Implement the function that checks whether a string is a valid identifier.
 * A valid identifier is a non-empty string that starts with a letter or underscore
 * and consists of only letters, digits and underscores.
 */

fun main(args:Array<String>){
    println(isValidIndentifier("name"))
    println(isValidIndentifier("_name"))
    println(isValidIndentifier("_12"))
    println(isValidIndentifier(""))
    println(isValidIndentifier("012"))
    println(isValidIndentifier("no$"))
}

fun isValidIndentifier(value:String):Boolean{
    if(value.isEmpty()) return false
    var identifier = true
    for((index,char) in value.withIndex()){
        if(index==0 && (char!='_'&& char !in 'a'..'z')){
            identifier = false
        }
        else if(char!='_'&& char !in 'a'..'z'&& char !in '1'..'2'){
            identifier = false
        }
    }
    return identifier
}