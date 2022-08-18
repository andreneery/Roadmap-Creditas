package account

class Account(
    val titular: String,
    val conta: Int,
    val saldoInicial: Double
) {
    var saldo = 0.0
        protected set
    //protected faz com o valor do saldo nao seja modificado em outros arquivos, mas permite que as classes "filhas"
    // a utilizem

    fun deposita(valor: Double){

        if(valor <= 0.0){
            this.saldo += valor + saldoInicial
        }
        else if(valor > 0 && valor <= 10_000){
            this.saldo += valor
        } else{
            throw error("valor não permitido")
        }
    }

    fun saque(valor: Double){
        if(saldo >= valor){
            this.saldo -= valor;
            if(saldo < 0){
                throw error("valor para saque não permitido")
                this.saldo += valor;
            }
        } else{
            throw error("valor para saque não permitido")
        }
    }

    fun transferencia(valor: Double, conta: Account){
        if (saldo > 0){
            this.saldo -= valor
            if(saldo < 0){
                throw error("valor para tranferência não permitida")
                this.saldo += valor;}
            conta.deposita(valor)
        } else {
            throw error("saldo em conta insuficiente")
        }
    }
}