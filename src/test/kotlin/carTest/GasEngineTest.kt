package carTest

import car.GasEngine
import car.HydrogenEngine
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class GasEngineTest {

    val gasEngine = GasEngine()

    @Test
    fun `quando requisitado o metodo isEnvironmentalFriendly, espera que retorne false`(){
        val expected = false

        assertEquals(expected, gasEngine.isEnvironmentalFriendly())
    }

    @Test
    fun `quando requisitado o metodo useFlammelFuel, espera que retorne true`(){
        val expected = true

        assertEquals(expected, gasEngine.useFlammelFuel())
    }

    @Test
    fun `quando requisitado o metodo useFossilFuel, espera que retorne true`(){
        val expected = true

        assertEquals(expected, gasEngine.useFossilFuel())
    }
}
