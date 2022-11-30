package account

class CaixaEletronico(
    private val account: Account
) {
    private val gaveta = Gaveta()

    fun deposito(valorTerminal: Double, valorDeposito: Double): String {
        conferirValores(valorTerminal)
        gaveta.abreGavetaDeposito(valorTerminal, valorDeposito)
        account.somarValores(valorTerminal)
        return "valor depositado com sucesso"
    }

    fun saque(valor: Double): String {
        conferirValores(valor)
        account.subtrairValores(valor)
        gaveta.abreGavetaSaque()
        return "saque realizado com sucesso"
    }

    private fun conferirValores(valorTerminal: Double): String {
        if (valorTerminal < 0.0 || valorTerminal > 10_000.0) {
            throw error("Valor informado não permitido")
        }
        return "transação permitida"
    }
}
