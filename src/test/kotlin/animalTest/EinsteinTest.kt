package animalTest

import animal.Einstein
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class EinsteinTest {

    val einstein = Einstein()

    @Test
    fun `sabe voar?`(){
        val expect = false

        assertEquals(expect, einstein.canFly())
    }

    @Test
    fun `sabe nadar?`(){
        val expect = true

        assertEquals(expect, einstein.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, einstein.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = false

        assertEquals(expect, einstein.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = false

        assertEquals(expect, einstein.layEggs())
    }
}
