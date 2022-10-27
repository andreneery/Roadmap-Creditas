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
         caixaEletronico.abreGaveta(CaixaEletronico.Gaveta.DEPOSITO)
        if(valor > 0.0 && valor <= 10_000.0){
            this.saldo += valor
        } else{
            throw error("valor não permitido")
        }
    }

    fun saque(valor: Double){
        if(valor <= saldo && valor > 0.0){
                this.saldo -= valor
            caixaEletronico.abreGaveta(CaixaEletronico.Gaveta.SAQUE)
            caixaEletronico.recebeDinheiro(valor)
            }
            else{
                caixaEletronico.devolveDinheiro(valor)
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
}
