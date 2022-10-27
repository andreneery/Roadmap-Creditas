package accountTest

import account.CaixaEletronico
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CaixaEletronicoTest {

    private val caixaEletronico = CaixaEletronico()

    @Test
    fun `quando chamada a funcao gaveta deposito, irá retornar mensagem para receber valor`(){
        val deposito = caixaEletronico.abreGaveta(CaixaEletronico.Gaveta.DEPOSITO)
        val expected = "abrindo gaveta para receber valor para deposito"
        assertEquals(expected = expected, actual = deposito)
    }

    @Test
    fun `quando chamada a funcao gaveta saque, irá retornar mensagem para emitir o valor`(){
        val saque = caixaEletronico.abreGaveta(CaixaEletronico.Gaveta.SAQUE)
        val expected = "abrindo gaveta para emitir o valor solicitado para saque"
        assertEquals(expected = expected, actual = saque)
    }

    @Test
    fun `quando chamada a funcao recebe dinheiro, irá retornar mensagem de recebimento de quantia`(){
        val recebeQuantia = caixaEletronico.recebeDinheiro(valor = 5.0)
        val expected = "Recebendo a quantia de R$5.0 do cliente..."
        assertEquals(expected = expected, actual = recebeQuantia)
    }

    @Test
    fun `quando a funcao recebe dinheiro der erro, irá retornar uma exception`(){
        val error = assertFailsWith<Throwable> {
            caixaEletronico.recebeDinheiro(error("Valor recebido não confere"))
        }

        assertEquals(error.message, "Valor recebido não confere")
    }

    @Test
    fun `quando chamada a funcao devolve dinheiro, irá retornar mensagem de devolucao`(){
        val devolveDinheiro = caixaEletronico.devolveDinheiro(700.0)
        val expected = "Devolvendo 700.0 reais ao cliente...\n"
        assertEquals(expected = expected, actual = devolveDinheiro)
    }
}
