package animalTest

import animal.Hawk
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class HawkTest {

    val hawk = Hawk()

    @Test
    fun `sabe voa?`(){
        val expect = true

        assertEquals(expect, hawk.canFly())
    }

    @Test
    fun `sabe nadar?`(){
        val expect = false

        assertEquals(expect, hawk.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, hawk.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, hawk.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = true

        assertEquals(expect, hawk.layEggs())
    }
}
