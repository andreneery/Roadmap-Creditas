package carTest

import car.GasolineEngine
import car.HydrogenEngine
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GasolineEngineTest {

    val gasolineEngine = GasolineEngine()

    @Test
    fun `quando requisitado o metodo isEnvironmentalFriendly, espera que retorne false`(){
        val expected = false

        assertEquals(expected, gasolineEngine.isEnvironmentalFriendly())
    }

    @Test
    fun `quando requisitado o metodo useFlammelFuel, espera que retorne true`(){
        val expected = true

        assertEquals(expected, gasolineEngine.useFlammelFuel())
    }

    @Test
    fun `quando requisitado o metodo useFossilFuel, espera que retorne true`(){
        val expected = true

        assertEquals(expected, gasolineEngine.useFossilFuel())
    }
}
