package learningclasses

fun main() {
    val miRectangulo = Rectangulo(5.5, 6.2)

    println("area rectangulo = ${miRectangulo.obtenerArea()}")

    println(miRectangulo.esCuadrado)
    println(miRectangulo.grosor)
}