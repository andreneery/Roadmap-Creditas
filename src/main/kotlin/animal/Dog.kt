package animal

class Dog: Mammal() {
    override fun canSwin(): Boolean {
        return false
    }

    override fun canFly(): Boolean {
        return false
    }


}