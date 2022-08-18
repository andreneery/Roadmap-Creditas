package calculoRetanguloOOP

fun main(){

    val retangulo = Retangulo(
        width = 5,
        height = 15,
        color = "red"
    )

    var resultado = retangulo.toString().also {
        print(it)
    }


}