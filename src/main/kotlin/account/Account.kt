package account
class Account(
    val titular: String,
    val conta: Int,
    val saldoInicial: Double,
){
    var saldo  = saldoInicial
        protected set

    fun deposita(valor: Double){
        val verificaValor = valorValidoParaDeposito(valor)
        if(verificaValor){
            this.saldo += valor
        } else{
            throw error("valor não permitido")
        }
    }

    fun saque(valor: Double){
        val verificarValorSaque = valorValidoSaque(valor)
        if(verificarValorSaque){
            this.saldo -= valor
        }
        else{
            throw error("valor não permitido")
        }
    }

    fun transferencia(valor: Double, conta: Account) {
        if (saldo > 0){
            saque(valor)
            conta.deposita(valor)}
        else {
            throw error("saldo em conta insuficiente")
        }
    }

    private fun valorValidoParaDeposito(valor: Double): Boolean{
        if(valor > 0.0 && valor <= 10_000.0){
            return true
        }
        return false
    }

    private fun valorValidoSaque(valor:Double):Boolean{
        if(valor <= saldo && valor > 0.0){
            return true
        }
        return false
    }
}
