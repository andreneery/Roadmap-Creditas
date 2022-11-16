package account

class Account(
    val titular: String,
    val conta: Int,
    val saldoInicial: Double,
){
    private val caixaEletronico = CaixaEletronico()
    var saldo  = saldoInicial
        protected set
    //protected faz com o valor do saldo nao seja modificado em outros arquivos, mas permite que as classes "filhas"
    // a utilizem

    fun deposita(valor: Double){
        val validador = valorValidoParaDeposito(valor)
        if (validador == false){
           throw error("Valor para deposito não permitido")
        }
        val depositarValor = caixaEletronico.recebeDinheiro(valor, saldo)
        saldo = depositarValor
    }

    fun saque(valor: Double){
        val validador = valorValidoParaSaque(valor)
        if(validador == false){
            throw error("Valor não permitido")
            }
        val saqueRealizado = caixaEletronico.emitirDinheiro(valor, saldo)
        saldo = saqueRealizado
        }

    fun transferencia(valor: Double, conta: Account) {
        if (saldo > 0){
            saque(valor)
            conta.deposita(valor)}
        else {
            throw error("saldo em conta insuficiente")
        }
    }

    private fun valorValidoParaDeposito(valor: Double): Boolean {
        if(valor > 0.0 && valor <= 10_000.0){
            return true
        }
        return false
    }

    private fun valorValidoParaSaque(valor: Double): Boolean{
        if(valor <= saldo && valor > 0.0){
            return true
        }
        return false
    }
}
