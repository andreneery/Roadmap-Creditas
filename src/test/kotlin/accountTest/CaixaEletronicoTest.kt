package accountTest

import account.Account
import account.CaixaEletronico
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CaixaEletronicoTest {

    @Test
    fun `quando chamada a funcao gaveta deposito, irá retornar mensagem para receber valor`(){
        val account = Account(
                titular = "Andre",
                conta = 1,
                saldoInicial = 100.0
            )
        val caixaEletronico = CaixaEletronico(account)
        val deposito = caixaEletronico.abreGaveta(CaixaEletronico.Gaveta.DEPOSITO)
        val expected = "abrindo gaveta para receber valor para deposito"
        assertEquals(expected = expected, actual = deposito)
    }

    @Test
    fun `quando chamada a funcao gaveta devolucao, ira retornar mensagem para devolver o valor`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 100.0
        )
        val caixaEletronico = CaixaEletronico(account)
        val saque = caixaEletronico.abreGaveta(CaixaEletronico.Gaveta.DEVOLUCAO)
        val expected = "Abrindo gaveta para devolver dinheiro"
        assertEquals(expected = expected, actual = saque)
    }

    @Test
    fun `quando chamada a funcao gaveta saque, irá retornar mensagem para emitir o valor`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 100.0
        )
        val caixaEletronico = CaixaEletronico(account)
        val saque = caixaEletronico.abreGaveta(CaixaEletronico.Gaveta.SAQUE)
        val expected = "abrindo gaveta para emitir o valor solicitado para saque"
        assertEquals(expected = expected, actual = saque)
    }

    @Test
    fun `quando chamada a funcao recebe dinheiro, irá retornar mensagem de recebimento de quantia`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 100.0
        )
        val caixaEletronico = CaixaEletronico(account)
        val recebeDinheiro = caixaEletronico.recebeDinheiro(5.0)
        val expected = "valor depositado com sucesso"
        val expectedSaldo = 105.0
        assertEquals(expected, recebeDinheiro)
        assertEquals(expectedSaldo, account.saldo)

    }

    @Test
    fun `quando a funcao recebe dinheiro der erro, irá retornar uma exception`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 100.0
        )
        val caixaEletronico = CaixaEletronico(account)
        val error = assertFailsWith<Throwable> {
            caixaEletronico.recebeDinheiro(-200.0)
        }

        assertEquals(error.message, "Deposito não compartivel")
    }

    @Test
    fun `testando a funcao emtir dinheiro`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 60.0
        )
        val caixaEletronico = CaixaEletronico(account)
        val emitirSaque = caixaEletronico.emitirDinheiro(10.0)
        val expected = "saque realizado com sucesso"
        val expectedSaldo = 50.0

        assertEquals(expected, emitirSaque)
        assertEquals(expectedSaldo, account.saldo)
    }

    @Test
    fun `quando a funcao emitir dinheiro der erro, irá retornar uma exception`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 100.0
        )
        val caixaEletronico = CaixaEletronico(account)
        val error = assertFailsWith<Throwable> {
            caixaEletronico.emitirDinheiro(-600.0)
        }

        assertEquals(error.message, "Saque não permitido")
    }
}
