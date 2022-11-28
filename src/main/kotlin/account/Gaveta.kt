package account

class Gaveta{

    fun abreGaveta(modalidade: Operacao, valorAccount: Double) {

        when(modalidade) {
            Operacao.DEPOSITO -> if (valorAccount > 0.0 && valorAccount < 10_000.0) {
                println("Valor compátivel")
                println("Abrindo Gaveta para depositar valor informado")
            } else {
                throw error("valor para deposito não permitido")
            }
            Operacao.SAQUE -> if(valorAccount > 0.0){
                println("abrindo gaveta para emitir o valor solicitado para saque")
            } else {
                throw error("valor para saque não permitido")
            }
            Operacao.DEVOLUCAO -> println("Abrindo gaveta para devolver dinheiro recebido")
        }
    }
}

enum class Operacao{
    DEPOSITO,
    SAQUE,
    DEVOLUCAO
}
