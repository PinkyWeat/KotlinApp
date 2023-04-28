package learningclasses

fun main() {
    val miRectangulo = Rectangulo(5.5, 6.2)

    println("area rectangulo = ${miRectangulo.obtenerArea()}")

    println(miRectangulo.esCuadrado)
    println(miRectangulo.grosor)

    val miDireccion = Direccion("Mayor", 28, 98752, "Madrid")
    val miDireccion2 = Direccion("Mayor", 28, 98752, "Madrid")
    println(miDireccion.toString())
    // con data si son ==, sin data no, porque te muestra una direccion en memoria
    // rather than la data en si
    println("Es miDireccion == miDireccion2? ${miDireccion.equals(miDireccion2)}")

    val miDireccion3 = miDireccion.copy(numero = 33)
    println(miDireccion3.toString())
}