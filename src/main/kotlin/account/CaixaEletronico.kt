package account

@Suppress("UNREACHABLE_CODE")
class CaixaEletronico{

    fun abreGaveta(gaveta: Gaveta): String {

        return when(gaveta){
            Gaveta.DEPOSITO -> "abrindo gaveta para receber valor para deposito"
            Gaveta.SAQUE -> "abrindo gaveta para emitir o valor solicitado para saque"
        }
    }

    fun recebeDinheiro(valor: Double): String {
        if(valor != valorErrado(valor)){
            return "Operação encerrada"
        }
        return  "Recebendo a quantia de R$${valor} do cliente..."
    }

    fun devolveDinheiro(valor: Double): String {

        return "Devolvendo $valor reais ao cliente...\n"
    }

    enum class Gaveta{
        DEPOSITO,
        SAQUE
    }

    private fun valorErrado(valor: Double): Double {
        if(valor != valor){
           return error("Valor recebido não confere")
        }
        return valor
    }
}
