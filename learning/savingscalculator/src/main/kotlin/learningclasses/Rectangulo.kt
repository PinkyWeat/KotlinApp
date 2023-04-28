package learningclasses

class Rectangulo(var ancho: Double, var alto: Double) {
    constructor(rectangulo: Rectangulo): this(rectangulo.ancho, rectangulo.alto)

    // estos dos van juntos wtfff
    val esCuadrado: Boolean
    get() = ancho == alto

    var grosor: Int = 1
    set(value) {
        if (value <= 0) {
            throw IllegalArgumentException("Grosor debe ser > 0")
        }
        field = value
        // seria grosor = value, pero field es la palabra reservada para esto
    }

    fun obtenerArea() = ancho * alto

}