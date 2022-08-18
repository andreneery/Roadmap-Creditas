package calculoRetangulo

fun main(){
    val rectangle = mutableMapOf("Width" to 10, "Height" to 10, "Color" to "Red");

    println("Primeira Área calculada: ${calcArea(rectangle)}");
    println(toString(rectangle));

    rectangle["Width"] = 20;
    println("\nSegunda Área calculada: ${calcArea(rectangle)}");
    println(toString(rectangle));

    rectangle["Height"] = 20;
    println("\nTerceira Área calculada: ${calcArea(rectangle)}");
    println(toString(rectangle));
}

// a função toString irá retornar os atributos do retangulo
// o Map server como um buscador de parametros de que seu desejo extrair
fun toString(shape: Map<String, Any>): String{
    return "Width = ${shape["Width"]}, Height = ${shape["Height"]}, Color = ${shape["Color"]}, Área = ${calcArea(shape)}"
}

fun calcArea(shape : Map<String, Any>) : Int{
    val height = shape["Height"] as Int
    val width = shape["Width"] as Int
    return height * width;
}
