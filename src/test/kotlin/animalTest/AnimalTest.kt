package animalTest

import animal.Animal
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AnimalTest {

    val animal = Animal()

    @Test
    fun `testando a funcao canSwin`() {
        val expect = true

        assertEquals(expect, animal.canSwin())
    }

    @Test
    fun `testando a funcao walkOnEarth`() {
        val expect = true

        assertEquals(expect, animal.walkOnEath())
    }

    @Test
    fun `testando a funcao canFly`() {
        val expect = true

        assertEquals(expect, animal.canFly())
    }

    @Test
    fun `testando a funcao isAlive`() {
        val expect = true

        assertEquals(expect, animal.isAlive())
    }

    @Test
    fun `testando a funcao layEggs`() {
        val expect = true

        assertEquals(expect, animal.layEggs())
    }
}
