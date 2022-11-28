package accountTest

import account.Account
import account.CaixaEletronico
import account.Gaveta
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CaixaEletronicoTest {
    @Test
    fun `quando chamada a funcao recebe dinheiro, irá realizar a operacao de deposito`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 100.0
        )
        val gaveta = Gaveta()
        val caixaEletronico = CaixaEletronico(account, gaveta)
        val recebeDinheiro = caixaEletronico.recebeDinheiro(25.0, 25.0)
        val expected = "valor depositado com sucesso"
        val expectedSaldo = 125.0
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
        val gaveta = Gaveta()
        val caixaEletronico = CaixaEletronico(account, gaveta)
        val error = assertFailsWith<Throwable> {
            caixaEletronico.recebeDinheiro(-200.0, -200.0)
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
        val gaveta = Gaveta()
        val caixaEletronico = CaixaEletronico(account, gaveta)
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
        val gaveta = Gaveta()
        val caixaEletronico = CaixaEletronico(account, gaveta)
        val error = assertFailsWith<Throwable> {
            caixaEletronico.emitirDinheiro(-600.0)
        }

        assertEquals(error.message, "Saque não permitido")
    }
}
