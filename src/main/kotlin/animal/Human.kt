package animal

open class Human(): Mammal() {

    override fun canFly(): Boolean {
        return false
    }
}