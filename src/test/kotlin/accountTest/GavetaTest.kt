package accountTest

import account.Gaveta
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class GavetaTest {

    @Nested
    inner class `#abreGavetaDeposito` {
        @Test
        fun `quando valor informado pelo cliente e o valor conferido forem iguais, ira retornar mensagem de valores conferidos`() {
            val gaveta = Gaveta()
            val gavetaDeposito = gaveta.abreGavetaDeposito(150.0, 150.0)
            val expected = "Valores conferidos"

            assertEquals(expected = expected, actual = gavetaDeposito)
        }

        @Test
        fun `quando valor informado pelo cliente e o valor de deposito forem diferentes, ira retornar uma exception`() {
            val gaveta = Gaveta()
            val error = assertFailsWith<Throwable> {
                gaveta.abreGavetaDeposito(150.0, 200.0)
            }
            assertEquals(error.message, "valores incompatíveis")
        }
    }

    @Nested
    inner class `#abreGavetaSaque` {
        @Test
        fun `quando abrir gaveta saque, ira retornar mensagem de emissao dos valores`() {
            val gaveta = Gaveta()
            val gavetaSaque = gaveta.abreGavetaSaque()
            val expected = "abrindo gaveta para emitir valor solicitado"
            assertEquals(expected = expected, actual = gavetaSaque)
        }
    }
}
