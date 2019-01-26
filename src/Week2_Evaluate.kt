


fun main(args:Array<String>){
    val case1 = evaluateGuess("DCFC","ABEC")
    val case2 = evaluateGuess("ABCD","CDBA")
    val case3 = evaluateGuess("ABCD","ABDC")
    val case4 = evaluateGuess("AABC","ADFE")
    val case5 = evaluateGuess("AABC","DEAA")
    val case6 = evaluateGuess("ACDC","DDDD")

    println("CASE1:")
    println("The right pos:${case1.rightPosition} " +
            "The wrong pos:${case1.wrongPosition}")

    println("CASE2:")
    println("The right pos:${case2.rightPosition} " +
            "The wrong pos:${case2.wrongPosition}")

    println("CASE3:")
    println("The right pos:${case3.rightPosition} " +
            "The wrong pos:${case3.wrongPosition}")

    println("CASE4:")
    println("The right pos:${case4.rightPosition} " +
            "The wrong pos:${case4.wrongPosition}")

    println("CASE5:")
    println("The right pos:${case5.rightPosition} " +
            "The wrong pos:${case5.wrongPosition}")

    println("CASE6:")
    println("The right pos:${case6.rightPosition} " +
            "The wrong pos:${case6.wrongPosition}")
}

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    val secretArray = secret.toCharArray()
    val guessArray = guess.toCharArray()
    return Evaluation(getRightPosition(secretArray, guessArray),getWrongPosition(secretArray, guessArray))
}

private fun getWrongPosition(secretArray: CharArray, guessArray: CharArray): Int {
    var index = 0
    var wrongPosition = 0
    while (index < secretArray.size && index < guessArray.size) {
        if (secretArray[index] != ' ' && guessArray.contains(secretArray[index])) {
            wrongPosition++
            guessArray[guessArray.indexOf(secretArray[index])] = ' '
            secretArray[index] = ' '
        }
        index++
    }
    return wrongPosition
}

private fun getRightPosition(secretArray: CharArray, guessArray: CharArray):Int {
    var index = 0
    var rightPosition = 0
    while (index < secretArray.size && index < guessArray.size) {
        if (secretArray[index] == guessArray[index]) {
            rightPosition++
            secretArray[index] = ' '
            guessArray[index] = ' '
        }
        index++
    }
    return rightPosition
}
