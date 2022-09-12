package animalTest

import animal.Mammal
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MammalTest {

    val mamifero = Mammal()

    @Test
    fun `sabe voa?`(){
        val expect = true

        assertEquals(expect, mamifero.canFly())
    }

    @Test
    fun `sabe nadar?`(){
        val expect = true

        assertEquals(expect, mamifero.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, mamifero.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, mamifero.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = false

        assertEquals(expect, mamifero.layEggs())
    }
}
