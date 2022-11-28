package account

class CaixaEletronico(
    private val account: Account,
    private val gaveta: Gaveta
) {

    fun recebeDinheiro(valorAccount: Double, valorDeposito: Double): String {
        conferirValores(valorAccount, valorDeposito)
        gaveta.abreGaveta(Operacao.DEPOSITO, valorAccount)
        account.deposita(valorAccount)
        return "valor depositado com sucesso"
    }

    fun emitirDinheiro(valor: Double): String {
        gaveta.abreGaveta(Operacao.SAQUE, valor)
        account.saque(valor)
        return "saque realizado com sucesso"
    }

    private fun conferirValores(valorAccount: Double, valorDeposito: Double): String {
        if (valorAccount != valorDeposito) {
            Operacao.DEVOLUCAO
            return error("Valor recebido não confere com valor informado")
        }
        return "transação permitida"
    }
}
