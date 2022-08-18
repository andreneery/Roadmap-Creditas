package animal

class Penguim: Bird(){

    override fun canFly(): Boolean {
        return false
    }

    override fun canSwin(): Boolean {
        return true
    }
}