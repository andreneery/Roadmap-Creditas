package accountTest

import account.Account
import account.CaixaEletronico
import account.Gaveta
import io.kotlintest.properties.verifyAll
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class CaixaEletronicoTest {

    @Nested
    inner class `#Deposito` {
        @Test
        fun `quando depositar um valor permitido, irá abrir a gaveta para receber o dinheiro, irá somar o valor inserido e irá retornar mensagem de deposito realizado`() {
            val account = Account(
                titular = "Andre",
                conta = 1,
                saldoInicial = 100.0
            )
            val gaveta = Gaveta()
            val caixaEletronico = CaixaEletronico(account, gaveta)
            val valorTerminal = 25.0
            val valorDeposito = 25.0
            val depositar = caixaEletronico.deposito(valorTerminal, valorDeposito)
            val expected = "valor depositado com sucesso"
            val expectedSaldo = 125.0
            val expectedGaveta = "Valores conferidos"

            assertEquals(expected, depositar)
            assertEquals(gaveta.abreGavetaDeposito(valorTerminal, valorDeposito), expectedGaveta)
            assertEquals(expectedSaldo, account.saldo)
        }

        @Test
        fun `quando for depositado um valor acima de 10mil, irá retornar uma exception e o saldo não será modificado`() {
            val account = Account(
                titular = "Andre",
                conta = 1,
                saldoInicial = 100.0
            )
            val gaveta = Gaveta()
            val caixaEletronico = CaixaEletronico(account, gaveta)
            val valorTerminal = 10_000.1
            val valorDeposito = 10_000.1
            val error = assertFailsWith<Throwable> {
                caixaEletronico.deposito(valorTerminal, valorDeposito)
            }

            assertEquals(error.message, "Valor informado não permitido")
            assertEquals(100.0, account.saldo)
        }
    }

    @Nested
    inner class `#saque` {
        @Test
        fun `testando o saque for um sucesso, irá retornar que o saque foi realizado`() {
            val account = Account(
                titular = "Andre",
                conta = 1,
                saldoInicial = 60.0
            )
            val gaveta = Gaveta()
            val caixaEletronico = CaixaEletronico(account, gaveta)
            val emitirSaque = caixaEletronico.saque(10.0)
            val expected = "saque realizado com sucesso"
            val expectedSaldo = 50.0
            val expectedGaveta = "abrindo gaveta para emitir valor solicitado"

            assertEquals(expected, emitirSaque)
            assertEquals(expectedGaveta, gaveta.abreGavetaSaque())
            assertEquals(expectedSaldo, account.saldo)
        }

        @Test
        fun `quando for solicitado saque acima de 10mil, irá retornar uma exception`() {
            val account = Account(
                titular = "Andre",
                conta = 1,
                saldoInicial = 100.0
            )
            val gaveta = Gaveta()
            val caixaEletronico = CaixaEletronico(account, gaveta)
            val error = assertFailsWith<Throwable> {
                caixaEletronico.saque(10_001.0)
            }

            assertEquals(error.message, "Valor informado não permitido")
            assertEquals(100.0, account.saldo)
        }
    }
}
