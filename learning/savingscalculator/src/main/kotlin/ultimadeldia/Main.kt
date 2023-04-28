package ultimadeldia

fun main() {
    println(calcularMedia(8.3, 5.9, 12.0))
    val misValores = doubleArrayOf(5.8, 9.3)
    println(calcularMedia(*misValores))
}

fun calcularMedia(vararg valores: Double): Double {
    var media = 0.0
    for (valor in valores){
        media += valor
    }
    media = media / valores.size
    return media
}