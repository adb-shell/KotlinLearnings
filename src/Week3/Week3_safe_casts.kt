package Week3

/**
 * Things learnt in safe casts
 * 1.is analogous if instance of
 * 2.safe cast as?
 */
fun main(args:Array<String>){
    val s = 12.0f

    println(s as? Int)
    println(s as Int?)
}