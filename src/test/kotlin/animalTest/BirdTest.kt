package animalTest

import animal.Bird
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BirdTest {

    val bird = Bird()

    @Test
    fun `sabe voar?`(){
        val expect = true

        assertEquals(expect, bird.canFly())
    }

    @Test
    fun `sabe nadar?`(){
        val expect = false

        assertEquals(expect, bird.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, bird.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, bird.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = true

        assertEquals(expect, bird.layEggs())
    }
}
