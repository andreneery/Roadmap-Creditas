package car

fun main(){

    println("Exercicio Carro")

    val gasEngine = GasEngine()
    val vehicleGas = Vehicle(gasEngine)

    println("\nMotor a gás: ")
    println("Nota de qualidade: ${vehicleGas.quality()}")
    println("Precisa de extintor: ${vehicleGas.extintor()}")

    val eletricEngine = EletricEngine()
    val vehicleEletric = Vehicle(eletricEngine)

    println("\nMotor eletrico: ")
    println("Nota de qualidade: ${vehicleEletric.quality()}")
    println("Precisa de extintor: ${vehicleEletric.extintor()}")

    val gasolineEngine = GasolineEngine()
    val vehicleGasoline = Vehicle(gasolineEngine)

    println("\nMotor a gasolina: ")
    println("Nota de qualidade: ${vehicleGasoline.quality()}")
    println("Precisa de extintor: ${vehicleGasoline.extintor()}")

    val hydrogenEngine = HydrogenEngine()
    val vehicleHydrogen = Vehicle(hydrogenEngine)

    println("\nMotor a Hidrogenio: ")
    println("Nota de qualidade: ${vehicleHydrogen.quality()}")
    println("Precisa de extintor: ${vehicleHydrogen.extintor()}")

    val flexEngine = FlexEngine()
    val vehicleFlex = Vehicle(flexEngine)

    println("\nMotor Flex: ")
    println("Combustivel utilizado: ${vehicleFlex.flex()}")
    println("Nota de qualidade: ${vehicleFlex.quality()}")
    println("Precisa de extintor: ${vehicleFlex.extintor()}")

}