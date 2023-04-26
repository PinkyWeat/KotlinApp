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

    val resultado = cuadrado(5.0)
    println(resultado)

}

// one line funcion!!! wtfff amazing
fun cuadrado (numero: Double) = numero * numero


/* asi seria lo comun
fun cuadrado(numero: Double): Double {
    return numero * numero
}
*/


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