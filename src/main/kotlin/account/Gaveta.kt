package account

class Gaveta{
    fun abreGavetaDeposito(valorTerminal: Double, valorDeposito: Double): String {
        println("abrindo gaveta para receber deposito")
        if(valorTerminal != valorDeposito){
            println("Retornando valor inserido na gaveta")
            throw error("valores incompatíveis")
        }
        return "Valores conferidos"
    }

    fun abreGavetaSaque(): String {
        return "abrindo gaveta para emitir valor solicitado"
    }
}
