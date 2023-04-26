package maspruebas

import java.nio.DoubleBuffer
import kotlin.math.ceil

fun main() {
    val area = calcularAreaRectangulo(0.5, 3.5)
    println(area)
}

fun calcularNumeroDeBaldosas(anchoEstancia: Double, largoEstancia: Double, anchoBaldosas: Double, largoBaldosa: Double): Int {

    fun comprobarDimensiones(ancho: Double, largo: Double){
        if (ancho <= 0 || largo <= 0) {
            throw IllegalArgumentException("No se puede realizar el calculo - las dimensiones deben ser > 0")
        }
    }
    comprobarDimensiones(anchoBaldosas, largoBaldosa)
    comprobarDimensiones(anchoEstancia, largoEstancia)
    val areaEstancia = calcularAreaRectangulo(anchoEstancia, largoEstancia)
    val areaBaldosa = calcularAreaRectangulo(anchoBaldosas, largoBaldosa)
    return ceil(areaEstancia / areaBaldosa).toInt()
}

fun calcularAreaRectangulo(ancho: Double, largo: Double): Double{
    return largo * ancho
}

