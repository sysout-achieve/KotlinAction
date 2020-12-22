class CalculatorTest {

    @org.junit.Test
    fun eval() {
        //given
        //(1+2)+4
        val calculator = Calculator()
        val expr = Sum(Sum(Num(1), Num(2)), Num(4))

        //when
        var result = calculator.eval(expr)
        //then
        assert(result == 7)
    }

}