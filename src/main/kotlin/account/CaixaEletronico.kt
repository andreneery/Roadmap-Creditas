package account

class CaixaEletronico() {

    fun abreGaveta(gaveta: Gaveta){

        when(gaveta){
            Gaveta.DEPOSITO -> return println("abrindo gaveta para receber valor para deposito")
            Gaveta.SAQUE -> return println("abrindo gaveta para emitir o valor solicitado para saque")
        }
    }

    fun valorErrado(valor: Double): Double {
        return valor
    }

    fun recebeDinheiro(valor: Double) {
        println("Sugando $valor reais do cliente...")

        if(valorErrado(valor) != valor){
            throw error("Valor recebido não confere")
            devolveDinheiro(valor)
        }
        println("Valor conferido")
    }

    fun devolveDinheiro(valor: Double) {
        println("Devolvendo $valor reais ao cliente...\n")
    }

    enum class Gaveta(){
        DEPOSITO,
        SAQUE
    }

}
