package accountTest

import account.Gaveta
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith


class GavetaTest {

    @Test
    fun `quando abrir gaveta for sucesso, ira retornar mensagem de valores conferidos`(){
        val gaveta = Gaveta()
        val gavetaDeposito = gaveta.abreGavetaDeposito(150.0, 150.0)
        val expected = "Valores conferidos"

        assertEquals(expected = expected, actual = gavetaDeposito)
    }

    @Test
    fun `quando abrir gaveta deposito receber um valor diferente, ira retornar uma exception`(){
        val gaveta = Gaveta()
        val error = assertFailsWith<Throwable> {
            gaveta.abreGavetaDeposito(150.0, 200.0)
        }
        assertEquals(error.message, "valores incompatíveis")
    }

    @Test
    fun `quando abrir gaveta saque, ira retornar mensagem de emissao dos valores`(){
        val gaveta = Gaveta()
        val gavetaSaque = gaveta.abreGavetaSaque()
        val expected = "abrindo gaveta para emitir valor solicitado"
        assertEquals(expected = expected, actual = gavetaSaque)
    }
}
