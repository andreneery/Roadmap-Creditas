package account

class CaixaEletronico(
    private val account: Account
){

    fun abreGaveta(gaveta: Gaveta): String {

        return when(gaveta){
            Gaveta.DEPOSITO -> "abrindo gaveta para receber valor para deposito"
            Gaveta.SAQUE -> "abrindo gaveta para emitir o valor solicitado para saque"
            Gaveta.DEVOLUCAO -> "Abrindo gaveta para devolver dinheiro"
        }
    }

    fun recebeDinheiro(valor: Double): String {
        if (valor != valorErrado(valor)) {
            Gaveta.DEVOLUCAO
            throw error("valor para deposito imcompatível com o solicitado")
        }
        verificarValorDeposito(valor)
        abreGaveta(Gaveta.DEPOSITO)
        account.deposita(valor)
        return "valor depositado com sucesso"
    }

    fun emitirDinheiro(valor: Double): String {
        verificaValorSaque(valor)
        abreGaveta(Gaveta.SAQUE)
        account.saque(valor)
        return "saque realizado com sucesso"
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

    private fun verificarValorDeposito(valor: Double): String {
        if(valor > 0.0 && valor <= 10_000.0){
            return "Valor informado ao caixa permitido"
        }
        Gaveta.DEVOLUCAO
        return throw error("Deposito não compartivel")
    }

    private fun verificaValorSaque(valor: Double): String {
        if(valor >=  0.0){
            return "Valor informado ao caixa permitido"
        }
        Gaveta.DEVOLUCAO
        return throw error("Saque não permitido")
    }
}
