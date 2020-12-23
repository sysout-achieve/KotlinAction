class Calculator {
    fun eval(e: Expr): Int =
        when (e) {
            is Expr.Num -> e.value
            is Expr.Sum -> eval(e.left) + eval(e.right)
        }

    fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Expr.Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Expr.Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: ${left} + ${right}")
                left + right
            }
//            else -> throw IllegalArgumentException("Unknown expression")
        }
}

sealed class Expr {
    class Num(val value: Int) : Expr()
    class Sum(val left: Expr, val right: Expr) : Expr()
}

fun main() {
    val calculator = Calculator()
//    println(calculator.eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(calculator.evalWithLogging(Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))))
}
