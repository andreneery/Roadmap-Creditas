package account

@Suppress("UNREACHABLE_CODE")
class CaixaEletronico{

    fun abreGaveta(gaveta: Gaveta): String {

        return when(gaveta){
            Gaveta.DEPOSITO -> "abrindo gaveta para receber valor para deposito"
            Gaveta.SAQUE -> "abrindo gaveta para emitir o valor solicitado para saque"
            Gaveta.DEVOLUCAO -> "Abrindo gaveta para devolver dinheiro"
        }
    }

    fun recebeDinheiro(valor: Double, saldo: Double): Double {
        if (valor != valorErrado(valor)) {
            Gaveta.DEVOLUCAO
            throw error("valor para deposito imcompatível com o solicitado ")
        }
        abreGaveta(Gaveta.DEPOSITO)
        return saldo + valor
    }

    fun emitirDinheiro(valor: Double, saldo: Double):Double{
        abreGaveta(Gaveta.SAQUE)
        return saldo - valor
    }

    enum class Gaveta{
        DEPOSITO,
        SAQUE,
        DEVOLUCAO
    }

    private fun valorErrado(valor: Double): Double {
        if(valor != valor){
           return error("Valor recebido não confere")
        }
        return valor
    }

    private fun verificarValorValido(saldo: Double): Boolean {
        if(saldo > 0.0 && saldo <= 10_000.0){
            return true
        }
        return false
    }
}
