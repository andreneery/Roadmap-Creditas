package account

fun main(){
    var andreConta = Account(
        titular = "André",
        conta = 1001,
        saldoInicial = 100.0
    )

    var andreContaPoupança = Account(
        titular = "Andrezinho",
        conta = 1002,
        saldoInicial = 50.0
    )

    println("Função deposita:")
    andreConta.deposita(100.0);
    println(andreConta.saldo)
    println()

    println("sacando valor, saldo total: ")
    andreConta.saque(50.0)
    println(andreConta.saldo)
    println()

    andreConta.transferencia(50.0, andreContaPoupança)
    println("valor da conta do André")
    println(andreConta.saldo)
    println("valor da conta poupança")
    println(andreContaPoupança.saldo)
    println()

    println("Função deposita:")
    andreConta.deposita(9_000.0)
    println("Saldo total: ")
    println(andreConta.saldo)
    println()
}
