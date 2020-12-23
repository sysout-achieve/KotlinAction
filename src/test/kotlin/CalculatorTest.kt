class CalculatorTest {

    @org.junit.Test
    fun eval() {
        //given
        //(1+2)+4
        val calculator = Calculator()
        val expr = Expr.Sum(Expr.Sum(Expr.Num(1), Expr.Num(2)), Expr.Num(4))

        //when
        var result = calculator.eval(expr)
        //then
        assert(result == 7)
    }

}