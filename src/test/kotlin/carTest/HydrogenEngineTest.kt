package carTest

import car.HydrogenEngine
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HydrogenEngineTest {

    val hydrogenEngine = HydrogenEngine()

    @Test
    fun `quando requisitado o metodo isEnvironmentalFriendly, espera que retorne true`(){
        val expected = true

        assertEquals(expected, hydrogenEngine.isEnvironmentalFriendly())
    }

    @Test
    fun `quando requisitado o metodo useFlammelFuel, espera que retorne true`(){
        val expected = true

        assertEquals(expected, hydrogenEngine.useFlammelFuel())
    }

    @Test
    fun `quando requisitado o metodo useFossilFuel, espera que retorne false`(){
        val expected = true

        assertEquals(expected, hydrogenEngine.useFossilFuel())
    }
}
