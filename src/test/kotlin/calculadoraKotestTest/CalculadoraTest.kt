package calculadoraKotestTest

import calculadoraKotest.Calculadora
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec


val calculadora = Calculadora()

class CalculadoraTest: StringSpec({

    "Testar soma da calculadora"{
        calculadora.soma(50,25).shouldBe(75)
        calculadora.soma(9,18). shouldBe(27)
        calculadora.soma(5,8). shouldBe(13)
    }

    "Testar a multiplicação"{
        calculadora.multiplicação(5,3).shouldBe(15)
        calculadora.multiplicação(9,5).shouldBe(45)
        calculadora.multiplicação(7,9).shouldBe(63)
    }

    "Testar a subtração"{
        calculadora.subtração(98,18).shouldBe(80)
        calculadora.subtração(100,80).shouldBe(20)
        calculadora.subtração(45,7).shouldBe(38)
    }

    "Testar Divisão"{
        calculadora.divisão(80,5).shouldBe(16)
        calculadora.divisão(64,4).shouldBe(16)
        calculadora.divisão(100,4).shouldBe(25)
        calculadora.divisão(81,9).shouldBe(9)

    }
})