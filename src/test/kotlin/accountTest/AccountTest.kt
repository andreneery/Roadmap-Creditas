package accountTest

import account.Account
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class AccountTest{

    @Test
    fun `verificando a instancializacao`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 100.0
        )
        val expected = 100.0

        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao deposita, sem valor inicial`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 0.0
        )
        val expected = 100.0

        account.deposita(100.0)

        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao deposita, com saldo inicial`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 50.0
        )

        val expected = 150.0

        account.deposita(100.0)

        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao deposita, valor negativo`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 0.0
        )
        val expected = 0.0

        val error = assertFailsWith<Throwable> {
            account.deposita(-200.0)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao deposita, valor negativo e saldo inicial`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 50.0
        )
        val expected = 50.0

        val error = assertFailsWith<Throwable> {
            account.deposita(-100.0)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expected, account.saldo)

    }

    @Test
    fun `Quando depositado mais que 10mil, espera que retorne um error`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 0.0
        )
        val expected = 0.0

        val error = assertFailsWith<Throwable> {
            account.deposita(10_100.0)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expected, account.saldo)
    }

    @Test
    fun `Quando depositado 10mil e com saldo inicial, espera que retorne um error e valor inicial mantido`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 50.00
        )
        val expected = 50.0

        val error = assertFailsWith<Throwable> {
            account.deposita(10_100.0)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao saque`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 200.00
        )

        val expected = 50.0

        account.saque(150.0)

        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao saque com saldo inicial zerado`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 0.0
        )
        val expected = 0.0
        val error = assertFailsWith<Throwable> {
            account.saque(250.0)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao saque com valor superior que o saldo inicial `(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 50.0
        )
        val expected = 50.0

        val error = assertFailsWith<Throwable> {
            account.saque(250.0)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao saque passando valor negativo`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 0.0
        )

        val expected = 0.0

        val error = assertFailsWith<Throwable> {
            account.saque(-250.0)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao saque com saldo inicial e passando valor negativo`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 25.0
        )

        val expected = 25.0

        val error = assertFailsWith<Throwable>{
            account.saque(-250.0)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expected, account.saldo)
    }

    @Test
    fun `testando a funcao transferencia`(){
        val accountAndre = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 600.0
        )

        val accountJulia = Account(
            titular = "Julia",
            conta = 2,
            saldoInicial = 50.0
        )

        val expectedAndre = 100.0
        val expectedJulia = 550.0

        accountAndre.transferencia(500.0, accountJulia)

        assertEquals(expectedAndre, accountAndre.saldo)
        assertEquals(expectedJulia, accountJulia.saldo)
    }

    @Test
    fun `testando a funcao transferencia, transferindo um valor negativo`(){
        val accountAndre = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 600.0
        )

        val accountJulia = Account(
            titular = "Julia",
            conta = 2,
            saldoInicial = 150.0
        )
        val expectedJulia = 150.0
        val expectedAndre = 600.0


        val error = assertFailsWith<Throwable> {
            val function = accountAndre.transferencia(-500.0, accountJulia)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expectedJulia, accountJulia.saldo)
        accountAndre.saldo.shouldBe(expectedAndre)
    }

    @Test
    fun `testando a funcao transferencia, transferindo um valor acima do permitido`(){
        val accountAndre = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 600.0
        )

        val accountJulia = Account(
            titular = "Julia",
            conta = 2,
            saldoInicial = 150.0
        )

        val expectAndre = 600.0
        val expectJulia = 150.0

        val error = assertFailsWith<Throwable> {
            accountAndre.transferencia(10_000.1, accountJulia)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expectAndre, accountAndre.saldo)
        assertEquals(expectJulia, accountJulia.saldo)
    }

    @Test
    fun `transferindo um valor acima do saldo inicial espera que as contas permaneçam com o mesmo saldo`(){
        val accountAndre = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 200.0
        )

        val accountJulia = Account(
            titular = "Julia",
            conta = 2,
            saldoInicial = 50.0
        )

        val expectAndre = 200.0
        val expectJulia = 50.0

        val error = assertFailsWith<Throwable> {
            accountAndre.transferencia(1_000.0, accountJulia)
        }

        assertEquals(error.message, "valor não permitido")
        assertEquals(expectAndre, accountAndre.saldo)
        assertEquals(expectJulia, accountJulia.saldo)
    }
}
