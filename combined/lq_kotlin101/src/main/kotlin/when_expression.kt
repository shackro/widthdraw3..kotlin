fun main() {
    var ch = 'A'
    when (ch) {
        'A' -> println("A is a Vowel")
        'E' -> println("E is a Vowel")
        'I' -> println("I is a Vowel")
        'O' -> println("O is a Vowel")
        'U' -> println("U is a Vowel")

        else -> println("$ch is a consonant")
    }

    val num1 = 7899
    when (num1) {
         in 1..9 -> println("It is a single digit number")
         in 10..9 -> println("It is a double digit number")
         in 100..999 -> println("It is a tripple digit number")
        else -> println("Has more than three digits")
    }

}