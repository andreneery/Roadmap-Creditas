package car

class FlexEngine(val option: String): Motor {

    fun verifica(): String {
        if(option == "alcool" || option == "gasolina"){
            return option
        } else {
            return throw error("combustível não permitido")
        }
    }

    override fun isEnvironmentalFriendly(): Boolean {
        verifica()
        if (option == "gasolina") {
            return false
        }
        return true
    }

    override fun useFlammelFuel(): Boolean {
        return true
    }

    override fun useFossilFuel(): Boolean {
        if (option == "gasolina") {
            return true
        }
        return false
    }
}
