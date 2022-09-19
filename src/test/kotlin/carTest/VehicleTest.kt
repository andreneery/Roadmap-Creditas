package carTest

import car.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.expect

class VehicleTest {

    @Test
    fun `quando motor informado for bom para o meio ambiente, retornar nota A`(){
        val motor = EletricEngine()
        val vehicle = Vehicle(motor)

        val expected = "Nota A"

        assertEquals(expected, vehicle.quality())
    }

    @Test
    fun `quando motor informado for bom para o meio ambiente e usa combustivel fossil, retornar nota B`(){
        val motor = HydrogenEngine()
        val vehicle = Vehicle(motor)

        val expected = "Nota B"

        assertEquals(expected, vehicle.quality())
    }

    @Test
    fun `quando motor informado for ruim para o meio ambiente, retornar nota C`(){
        val motor = GasolineEngine()
        val vehicle = Vehicle(motor)

        val expected = "Nota C"

        assertEquals(expected, vehicle.quality())
    }

    @Test
    fun `quando motor informado utilizar combustivel flamável, retorna true`(){
        val motor = GasolineEngine()
        val vehicle = Vehicle(motor)

        val expected = true

        assertEquals(expected, vehicle.extintor())
    }

    @Test
    fun `quando motor informado não utilizar combustivel flamável, retorna false`(){
        val motor = EletricEngine()
        val vehicle = Vehicle(motor)

        val expected = false

        assertEquals(expected, vehicle.extintor())
    }


}
