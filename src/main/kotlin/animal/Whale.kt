package animal

class Whale: Mammal() {
    override fun walkOnEath(): Boolean {
        return false
    }

    override fun canFly(): Boolean {
        return false
    }
}