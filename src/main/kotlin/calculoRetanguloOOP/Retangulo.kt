package calculoRetanguloOOP

open class Retangulo(
    var width: Int,
    var height: Int,
    var color: String
){


    fun calcArea(): Int{
        return width * height
    }

    override fun toString(): String{
        return "Width = ${width},\nHeight = ${height},\nColor = ${color}, \nArea: ${calcArea()}"
    }
}
