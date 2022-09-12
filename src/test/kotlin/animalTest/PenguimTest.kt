package animalTest

import animal.Penguim
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PenguimTest {

    val penguim = Penguim()

    @Test
    fun `sabe voa?`(){
        val expect = false

        assertEquals(expect, penguim.canFly())
    }

    @Test
    fun `sabe nadar?`(){
        val expect = true

        assertEquals(expect, penguim.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, penguim.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, penguim.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = true

        assertEquals(expect, penguim.layEggs())
    }
}
