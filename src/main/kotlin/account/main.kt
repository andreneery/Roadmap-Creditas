package account

fun main(){
    val andreConta = Account(
        titular = "André",
        conta = 1001,
        saldoInicial = 100.0
    )

    val andreContaPoupanca = Account(
        titular = "Andrezinho",
        conta = 1002,
        saldoInicial = 50.0
    )

    println("Função deposita:")
    andreConta.deposita(100.0)
    println(andreConta.saldo)
    println()

    println("sacando valor, saldo total: ")
    andreConta.saque(50.0)
    println(andreConta.saldo)
    println()

    andreConta.transferencia(50.0, andreContaPoupanca)
    println("valor da conta do André")
    println(andreConta.saldo)
    println("valor da conta poupança")
    println(andreContaPoupanca.saldo)
    println()

    println("Função deposita:")
    andreConta.deposita(9_000.0)
    println("Saldo total: ")
    println(andreConta.saldo)
    println()
}
