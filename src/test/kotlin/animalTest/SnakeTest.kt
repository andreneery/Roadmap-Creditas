package animalTest

import animal.Snake
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SnakeTest {

    val cobra = Snake()

    @Test
    fun `sabe voa?`() {
        val expect = false

        assertEquals(expect, cobra.canFly())
    }

    @Test
    fun `sabe nadar?`() {
        val expect = false

        assertEquals(expect, cobra.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, cobra.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, cobra.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = true

        assertEquals(expect, cobra.layEggs())
    }
}
