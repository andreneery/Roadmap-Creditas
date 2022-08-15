package animal

class Bat: Mammal() {

    override fun canFly(): Boolean {
        return true
    }

    override fun canSwin(): Boolean {
        return false
    }
}