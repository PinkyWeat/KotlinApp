package classesanidadas

class Ordenador(val RamGB: Double, val procesador: Procesador) {
    class Procesador(val numeroDeNucleos: Int, val frecuenciaGHz: Double) {
        fun mostrarEspecificaciones() {
            println("Numero nucleos: $numeroDeNucleos, Frecuencia: $frecuenciaGHz")
        }
    }
}