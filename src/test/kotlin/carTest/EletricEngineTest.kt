package carTest

import car.EletricEngine
import car.HydrogenEngine
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EletricEngineTest {

    val eletricEngine = EletricEngine()

    @Test
    fun `quando requisitado o metodo isEnvironmentalFriendly, espera que retorne true`(){
        val expected = true

        assertEquals(expected, eletricEngine.isEnvironmentalFriendly())
    }

    @Test
    fun `quando requisitado o metodo useFlammelFuel, espera que retorne false`(){
        val expected = false

        assertEquals(expected, eletricEngine.useFlammelFuel())
    }

    @Test
    fun `quando requisitado o metodo useFossilFuel, espera que retorne false`(){
        val expected = false

        assertEquals(expected, eletricEngine.useFossilFuel())
    }
}
