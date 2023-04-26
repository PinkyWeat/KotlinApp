package pruebas

import java.time.LocalDate
import kotlin.math.PI
import kotlin.math.pow

fun main() {
    println("Comienza la ejecucion del programa")
    saludar()
    val area = areaDelCirculo(2.5)
    println("El area del circulo es: $area")
    // si pasas dos variables, podes pasarlas en el orden que te pinte!! Kotlin se da cuenta!! KOTLIN GOD
}

fun mostrarFecha(){
    val fechaLocal = LocalDate.now()
    println("La fecha actual es $fechaLocal")
}

fun saludar(nombre: String = "Batman"){
    println("Hola, $nombre")
}

fun areaDelCirculo(radio: Double): Double{
    return PI * radio.pow(2)
}