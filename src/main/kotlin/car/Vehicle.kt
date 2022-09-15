package car

class Vehicle(val motor: Motor){

    fun quality(): String {
        if(motor.isEnvironmentalFriendly() == true && motor.useFossilFuel() == false){
            return "Nota A"
        }
        else if(motor.isEnvironmentalFriendly() == true && motor.useFossilFuel() == true){
            return "Nota B"
        }
        else if(motor.isEnvironmentalFriendly() == false){
            return "Nota C"
        }
        return error("veiculo não se encaixa nos parametros de qualidade")
    }

    fun extintor(): Boolean{
            return motor.useFossilFuel() || motor.useFlammelFuel()
    }
}
