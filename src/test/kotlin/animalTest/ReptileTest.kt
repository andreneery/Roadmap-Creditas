package animalTest


import animal.Reptile
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ReptileTest {

    val reptil = Reptile()

    @Test
    fun `sabe voa?`(){
        val expect = false

        assertEquals(expect, reptil.canFly())
    }

    @Test
    fun `sabe nadar?`(){
        val expect = true

        assertEquals(expect, reptil.canSwin())
        //crocodilo é um reptil e sabe nadar
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, reptil.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, reptil.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = true

        assertEquals(expect, reptil.layEggs())
    }
}
