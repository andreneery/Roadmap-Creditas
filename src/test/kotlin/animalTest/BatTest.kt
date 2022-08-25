package animalTest

import animal.Bat
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BatTest {

    val bat = Bat()

    @Test
    fun `morcego voa?`(){
        val expect = true

        assertEquals(expect, bat.canFly())
    }

    @Test
    fun `morcego sabe nadar?`(){
        val expect = false

        assertEquals(expect, bat.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, bat.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, bat.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = false

        assertEquals(expect, bat.layEggs())
    }
}
