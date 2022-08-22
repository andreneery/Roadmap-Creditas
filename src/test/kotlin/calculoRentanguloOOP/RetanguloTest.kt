package calculoRentanguloOOP

import calculoRetanguloOOP.Retangulo
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RetanguloTest {

    val retangulo = Retangulo(width = 15, height = 20, color = "red")

    @Test
    fun `testando a função de calcular a area`(){
        val expect = 300


        assertEquals(expect, retangulo.calcArea())
    }

    @Test
    fun `testando a função que converte tudo em String`(){
        val expect = "Width = 15,\nHeight = 20,\nColor = red, \nArea: 300"

        assertEquals(expect, retangulo.toString())
    }
}
