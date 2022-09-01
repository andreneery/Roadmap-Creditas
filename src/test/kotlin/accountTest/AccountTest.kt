package accountTest

import account.Account
import io.kotlintest.shouldBe
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class AccountTest(){

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
        account.deposita(100.0)
        val expected = account.saldo.shouldBe(100.0)

        assertEquals(expected, account.deposita(100.0))
    }

    @Test
    fun `testando a funcao deposita, com saldo inicial`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 50.0
        )
        account.deposita(100.0)
        val expected = account.saldo.shouldBe(150.0)

        assertEquals(expected, account.deposita(100.0))
    }

    @Test
    fun `testando a funcao deposita, valor negativo`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 0.0
        )
        val function = account.deposita(-100.0)
        val expected = account.saldo.shouldBe(0.0)

        assertFailsWith<Throwable> {error("valor não permitido")}
        assertEquals(expected, function)
    }

    @Test
    fun `testando a funcao deposita, valor negativo e saldo inicial`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 50.0
        )
        val expected = account.saldo.shouldBe(50.0)

        assertEquals(expected, account.deposita(-100.0))
        assertFailsWith<Throwable> {throw error("valor não permitido")}
    }

    @Test
    fun `Quando depositado 10mil, espera que retorne um error`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 0.0
        )
        val expected = account.saldo.shouldBe(0.0)

        assertEquals(expected, account.deposita(10_000.0))
        assertFailsWith<Throwable> {throw error("valor não permitido")}
    }

    @Test
    fun `Quando depositado 10mil e com saldo inicial, espera que retorne um error e valor inicial mantido`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 50.00
        )
        val expected = account.saldo.shouldBe(50.0)

        assertEquals(expected, account.deposita(10_000.0))
        assertFailsWith<Throwable> {throw error("valor não permitido")}
    }

    @Test
    fun `testando a funcao saque`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 200.00
        )

        val operation = account.saque(150.0)
        val expected = account.saldo.shouldBe(50.0)

        assertEquals(expected, operation)
    }

    @Test
    fun `testando a funcao saque com saldo inicial zerado`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 0.0
        )

        val operation = account.saque(250.0)
        val expected = throw error("valor para saque não permitido")

        assertEquals(expected, operation)
    }

    @Test
    fun `testando a funcao saque com saldo inicial`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 50.0
        )

        val operation = account.saque(250.0)
        val expected = throw error("valor para saque não permitido")

        assertEquals(expected, operation)
    }

    @Test
    fun `testando a funcao saque passando valor negativo`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 0.0
        )

        val operation = account.saque(-250.0)
        val expected = throw error("valor para saque não permitido")

        assertEquals(expected, operation)
    }

    @Test
    fun `testando a funcao saque com saldo inicial e passando valor negativo`(){
        val account = Account(
            titular = "Andre",
            conta = 1,
            saldoInicial = 25.0
        )

        val operation = account.saque(-250.0)
        val expected = account.saldo.shouldBe(25.0)

        assertEquals(expected, operation)
        //encontrado um bug na parte dos if na função saque
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

        val operation = accountAndre.transferencia(500.0, accountJulia)
        val expected = accountJulia.saldo.shouldBe(550.0).shouldBe(accountAndre.saldo.shouldBe(100.0))

        assertEquals(expected, operation)
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

        val operation = accountAndre.transferencia(-500.0, accountJulia)
        val expected = accountJulia.saldo.shouldBe(550.0).shouldBe(accountAndre.saldo.shouldBe(150.0))

        assertEquals(expected, operation)
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

        val operation = accountAndre.transferencia(10_000.0, accountJulia)
        val expected = accountJulia.saldo.shouldBe(550.0).shouldBe(accountAndre.saldo.shouldBe(150.0))

        assertEquals(expected, operation)
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

        val operation = accountAndre.transferencia(1_000.0, accountJulia)
        val expected = accountJulia.saldo.shouldBe(50.0).shouldBe(accountAndre.saldo.shouldBe(200.0))

        assertEquals(expected, operation)
    }
}
