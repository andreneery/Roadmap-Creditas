package animalTest

import animal.Platypus
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PlatypusTest {

    val perryOnitorrinco = Platypus()

    @Test
    fun `sabe voa?`(){
        val expect = false

        assertEquals(expect, perryOnitorrinco.canFly())
        // onitorrinco não sabe voar
    }

    @Test
    fun `sabe nadar?`(){
        val expect = true

        assertEquals(expect, perryOnitorrinco.canSwin())
    }

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, perryOnitorrinco.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, perryOnitorrinco.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = true

        assertEquals(expect, perryOnitorrinco.layEggs())
    }
}
