package animalTest

import animal.Whale
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class WhaleTest {

    val baleia = Whale()

    @Test
    fun `sabe voa?`(){
        val expect = false

        assertEquals(expect, baleia.canFly())
    }

    @Test
    fun `sabe nadar?`(){
        val expect = true

        assertEquals(expect, baleia.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = false

        assertEquals(expect, baleia.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, baleia.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = false

        assertEquals(expect, baleia.layEggs())
    }
}
