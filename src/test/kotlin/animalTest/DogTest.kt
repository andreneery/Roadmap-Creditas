package animalTest

import animal.Dog
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DogTest {

    val doguinho = Dog()

    @Test
    fun `sabe voar?`(){
        val expect = false

        assertEquals(expect, doguinho.canFly())
    }

    @Test
    fun `sabe nadar?`(){
        val expect = true

        assertEquals(expect, doguinho.canSwin())
    }
    // cachorro sabe nadar (nado cachorrinho)

    @Test
    fun `anda na terra?`() {
        val expect = true

        assertEquals(expect, doguinho.walkOnEath())
    }


    @Test
    fun `esta vivo?`() {
        val expect = true

        assertEquals(expect, doguinho.isAlive())
    }

    @Test
    fun `poe ovos?`() {
        val expect = false

        assertEquals(expect, doguinho.layEggs())
    }
}
