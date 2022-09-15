package car

open class GasolineEngine(): Motor {
    override fun isEnvironmentalFriendly(): Boolean {
        return false
    }

    override fun useFlammelFuel(): Boolean {
        return true
    }

    override fun useFossilFuel(): Boolean {
        return true
    }
}
