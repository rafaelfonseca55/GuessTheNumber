
fun randomNumberGenerator(min: Int, max: Int) = (min..max).random()

fun game() {
    println("What is the min value of your interval? Default Value = 0")
    val min = readLine()?.ifBlank { 0 }.toString()
    println("What is the max value of your interval? Default Value = 100")
    val max = readLine()?.ifBlank { 100 }.toString()
    val answer = randomNumberGenerator(min.toInt(), max.toInt())
    var correct = false
    var tries = 1
    println("Guess a number from $min to $max. Default Value = 50")
    var guess = readLine()?.ifBlank { 50 }.toString()
    if (guess.toInt() == answer) return println("You guessed it right! You guessed it in $tries try!")

    while (!correct) {
        if (guess.toInt() > answer) {
            tries++
            println("Your guess was too high!")
            guess = readLine()?.ifBlank { 50 }.toString()
            if (guess.toInt() == answer) {
                correct = true
                return println("Correct! You guessed it in $tries tries!")
            }
        }
        if (guess.toInt() < answer) {
            tries++
            println("Your guess was too low!")
            guess = readLine()?.ifBlank { 50 }.toString()
            if (guess.toInt() == answer) {
                correct = true
                return println("Correct! You guessed it in $tries tries!")
            }
        }
    }
}


fun main() {
    game()
}
