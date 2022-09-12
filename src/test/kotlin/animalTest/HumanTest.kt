package animalTest

import animal.Human
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HumanTest {

    val humano = Human()

    @Test
    fun `sabe voa?`(){
        val expect = false

        assertEquals(expect, humano.canFly())
    }

    @Test
    fun `sabe nadar?`(){
        val expect = true

        assertEquals(expect, humano.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, humano.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, humano.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = false

        assertEquals(expect, humano.layEggs())
    }
}
