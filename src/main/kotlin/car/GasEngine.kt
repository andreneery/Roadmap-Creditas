package car

class GasEngine(): Motor {
    override fun isEnvironmentalFriendly(): Boolean {
        return false
    }

    override fun useFlammelFuel(): Boolean {
        return true
    }

    override fun useFossilFuel(): Boolean {
        return false
    }
}