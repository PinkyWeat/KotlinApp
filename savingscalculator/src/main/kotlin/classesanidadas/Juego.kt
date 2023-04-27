package classesanidadas

class Juego {
    var puntuacion = 0

    inner class Marcador() {
        fun incrermentar(puntos: Int) {
            puntuacion += puntos
        }
        fun decrementar(puntos: Int) {
            puntuacion -= puntos
        }
    }
}