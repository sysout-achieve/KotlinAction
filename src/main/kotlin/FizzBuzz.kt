class FizzBuzz {
    fun fizzBuzz(num: Int): String =
        when {
            num % 15 == 0 -> "FizzBuzz"
            num % 5 == 0 -> "Buzz"
            num % 3 == 0 -> "Fizz"
            else -> "${num}"
        }

    fun play(limit:Int){
        for (i in 1..limit) println(fizzBuzz(i))
    }
}

fun main() {
    val fizzBuzz = FizzBuzz()
    fizzBuzz.play(100)
}