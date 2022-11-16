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
    fun `quando chamada a funcao gaveta devolucao, ira retornar mensagem para devolver o valor`(){
        val saque = caixaEletronico.abreGaveta(CaixaEletronico.Gaveta.DEVOLUCAO)
        val expected = "Abrindo gaveta para devolver dinheiro"
        assertEquals(expected = expected, actual = saque)
    }

    @Test
    fun `quando chamada a funcao gaveta saque, irá retornar mensagem para emitir o valor`(){
        val saque = caixaEletronico.abreGaveta(CaixaEletronico.Gaveta.SAQUE)
        val expected = "abrindo gaveta para emitir o valor solicitado para saque"
        assertEquals(expected = expected, actual = saque)
    }

    @Test
    fun `quando chamada a funcao recebe dinheiro, irá retornar mensagem de recebimento de quantia`(){
        val saldo = 50.0
        val recebeDinheiro = caixaEletronico.recebeDinheiro(5.0, saldo)
        val expected = 55.0
        assertEquals(expected, recebeDinheiro)

    }

    @Test
    fun `quando a funcao recebe dinheiro der erro, irá retornar uma exception`(){
        val error = assertFailsWith<Throwable> {
            caixaEletronico.recebeDinheiro(error("valor para deposito imcompatível com o solicitado"), 55.0)
        }

        assertEquals(error.message, "valor para deposito imcompatível com o solicitado")
    }

    @Test
    fun `testando a funcao emtir dinheiro`(){
        val saldo = 50.0
        val emitir = caixaEletronico.emitirDinheiro(10.0, saldo)
        val expected = 40.0

        assertEquals(expected, emitir)
    }
}
