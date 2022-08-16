package testeIntroducao

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SomaTest {
    private val soma = Soma()

    @Test
    fun testSum() {
        val expected = 12
        assertEquals(expected, soma.somar(7, 5))
    }
}
