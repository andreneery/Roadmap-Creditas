package carTest

import car.FlexEngine
import org.junit.jupiter.api.Test
import kotlin.test.*


class FlexEngineTest {

    @Test
    fun `quando passado uma classe que nao seja gasolina ou alcool, espera-se um erro`(){
        val flexEngine = FlexEngine("agua")

       val error = assertFailsWith<Throwable> {
           flexEngine.verifica()
        }

        assertEquals(error.message, "combustível não permitido")


    }

    @Test
    fun `quando requisitado o metodo isEnvironmentalFriendly for gasolina, espera que retorne false`() {
        val flexEngine = FlexEngine("gasolina")
        val expected = false

        assertEquals(expected, flexEngine.isEnvironmentalFriendly())
    }

    @Test
    fun `quando requisitado o metodo isEnvironmentalFriendly for alcool, espera que retorne true`() {
        val flexEngine = FlexEngine("alcool")
        val expected = true

        assertEquals(expected, flexEngine.isEnvironmentalFriendly())
    }

    @Test
    fun `quando requisitado o metodo useFlammelFuel for gasolina, espera que retorne true`() {
        val flexEngine = FlexEngine("gasolina")
        val expected = true

        assertEquals(expected, flexEngine.useFlammelFuel())
    }

    @Test
    fun `quando requisitado o metodo useFlammelFuel for alcool, espera que retorne true`() {
        val flexEngine = FlexEngine("gasolina")
        val expected = true

        assertEquals(expected, flexEngine.useFlammelFuel())
    }

    @Test
    fun `quando requisitado o metodo useFossilFuel for gasolina, espera que retorne true`() {
        val flexEngine = FlexEngine("gasolina")
        val expected = true

        assertEquals(expected, flexEngine.useFossilFuel())
    }

    @Test
    fun `quando requisitado o metodo useFossilFuel for alcool, espera que retorne false`() {
        val flexEngine = FlexEngine("alcool")
        val expected = false

        assertEquals(expected, flexEngine.useFossilFuel())
    }
}
