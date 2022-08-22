package calculadoraJUnit

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculadoraTest(){

    val calculadora = Calculadora()

    @Test
    fun `verificando a operacao de soma`(){
        val expected = 15

        assertEquals(expected, calculadora.soma(7,8))
    }

    @Test
    fun `verificando a operacao de subtracao`(){
        val experted = 4

        assertEquals(experted, calculadora.subtracao(14,10))
    }

    @Test
    fun `verificando a operacao de multiplicacao`(){
        val expected = 81

        assertEquals(expected, calculadora.multiplicacao(9,9))
    }

    @Test
    fun `verificando a operacao de divisao`(){
        val expected = 2

        assertEquals(expected, calculadora.divisao(4,2))
    }
}
