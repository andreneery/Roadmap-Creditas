package account

class CaixaEletronico(
    private val account: Account
) {

    fun abreGaveta(gaveta: Gaveta){

        when(gaveta){
            Gaveta.DEPOSITO -> return println("abrindo gaveta para receber valor para deposito")
            Gaveta.SAQUE -> return println("abrindo gaveta para emitir o valor solicitado para saque")
        }
    }

    fun valorErrado(valor: Double): Double {
        if(valor != valor){
            throw error("Valor recebido não confere")
            devolveDinheiro(valor)
        }
        return valor
    }


    fun recebeDinheiro(valor: Double) {
        println("Sugando $valor reais do cliente...")
        valorErrado(valor)
    }

    fun devolveDinheiro(valor: Double): Double {
        account.saque(valor)
        println("Devolvendo $valor reais ao cliente...\n")
        return valor
    }

    enum class Gaveta(){
        DEPOSITO,
        SAQUE
    }

}
