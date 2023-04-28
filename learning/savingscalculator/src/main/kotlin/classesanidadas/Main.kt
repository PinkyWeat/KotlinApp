package classesanidadas

fun main() {
    val miProcesador = Ordenador.Procesador(4, 2.5)

    miProcesador.mostrarEspecificaciones()

    val miJuego = Juego()
    val miMarcador = miJuego.Marcador()
    miMarcador.incrermentar(20)
    println(miJuego.puntuacion)
}