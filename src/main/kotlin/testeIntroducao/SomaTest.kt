package testeIntroducao

import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class SomaTest {
    private val soma = Soma()

    @Test
    fun testSum() {
        val expected = 12
        assertEquals(expected, soma.somar(7, 5))
    }
}
