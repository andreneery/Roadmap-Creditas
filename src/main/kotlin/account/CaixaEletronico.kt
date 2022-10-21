package account

@Suppress("UNREACHABLE_CODE")
class CaixaEletronico{

    fun abreGaveta(gaveta: Gaveta){

        when(gaveta){
            Gaveta.DEPOSITO -> return println("abrindo gaveta para receber valor para deposito")
            Gaveta.SAQUE -> return println("abrindo gaveta para emitir o valor solicitado para saque")
        }
    }

    fun recebeDinheiro(valor: Double) {
        println("Sugando $valor reais do cliente...")
        valorErrado(valor)
    }

    fun devolveDinheiro(valor: Double): Double {
        println("Devolvendo $valor reais ao cliente...\n")
        return valor
    }

    enum class Gaveta{
        DEPOSITO,
        SAQUE
    }

    private fun valorErrado(valor: Double): Double {
        if(valor != valor){
            throw error("Valor recebido não confere")
        }
        return valor
    }
}
