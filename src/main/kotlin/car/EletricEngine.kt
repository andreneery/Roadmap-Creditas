package car

class EletricEngine(): Motor {
    override fun isEnvironmentalFriendly(): Boolean {
        return true
    }

    override fun useFlammelFuel(): Boolean {
        return false
    }

    override fun useFossilFuel(): Boolean {
        return false
    }
}