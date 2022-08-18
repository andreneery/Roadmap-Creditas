package animal

open class Reptile(): Animal() {

    override fun canSwin(): Boolean {
        return false
    }

    override fun canFly(): Boolean {
        return false
    }
}