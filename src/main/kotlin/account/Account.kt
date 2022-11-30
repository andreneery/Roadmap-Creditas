package account
class Account(
    val titular: String,
    val conta: Int,
    val saldoInicial: Double
){
    var saldo  = saldoInicial
        protected set

    fun somarValores(valor: Double){
            this.saldo += valor
    }

    fun subtrairValores(valor: Double){
        if(valor > 0.0 && valor <= saldo){
            this.saldo -= valor
        }
        else{
            throw error("valor não permitido")
        }
    }

    fun transferencia(valor: Double, conta: Account) {
        if (saldo > 0){
            subtrairValores(valor)
            conta.somarValores(valor)}
        else {
            throw error("saldo em conta insuficiente")
        }
    }
}
