class Calculator {
    fun eval(e: Expr): Int =
        when (e) {
            is Num -> e.value
            is Sum -> eval(e.left) + eval(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }

    fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: ${left} + ${right}")
                left + right
            }
            else -> throw IllegalArgumentException("Unknown expression")
    }
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun main() {
    val calculator = Calculator()
//    println(calculator.eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(calculator.evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}
