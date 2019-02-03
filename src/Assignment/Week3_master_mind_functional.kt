package Assignment

fun evaluateGuess1(secret: String, guess: String): Evaluation {

    val rightPositions = secret.zip(guess).count {
        it-> it.first == it.second
    }

    val commonLetters = "ABCDEF".sumBy { ch ->
        Math.min(secret.count { it->it==ch }, guess.count { it->it==ch })
    }
    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main(args: Array<String>) {
    val result = Evaluation(rightPosition = 1, wrongPosition = 1)
    evaluateGuess1("BCDF", "ACEB") eq result
    evaluateGuess1("AAAF", "ABCA") eq result
    evaluateGuess1("ABCA", "AAAF") eq result
}