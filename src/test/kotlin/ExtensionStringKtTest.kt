import org.junit.Assert.*
import org.junit.Test

class ExtensionStringKtTest{
    @Test
    fun extensionTest() {
        //given
        var str = "Kotlin"
        var expectedChar = 'n'

        println(str.lastChar())
        //then
        assertEquals(str.lastChar(), expectedChar)
    }
}

