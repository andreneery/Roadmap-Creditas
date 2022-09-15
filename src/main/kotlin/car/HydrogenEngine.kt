package car

class HydrogenEngine():Motor {
    override fun isEnvironmentalFriendly(): Boolean {
        return true
    }

    override fun useFlammelFuel(): Boolean {
        return true
    }

    override fun useFossilFuel(): Boolean {
        return true
    }
}
