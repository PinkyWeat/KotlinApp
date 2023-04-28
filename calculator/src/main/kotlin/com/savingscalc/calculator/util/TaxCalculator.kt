package com.savingscalc.calculator.util

import kotlin.math.min


fun TaxCalculator(salary: Double): Double {
    // me devuelve un double, porque devuelve lo que queda despues
    // de todos los descuentos

    val iRPF: Double = calculateIRPF(salary)
    val fonasa: Double = calculateFONASA(salary)
    val frl: Double = calculateFRL(salary)
    val jubilatorio: Double = calculateJubilatorio(salary)


    val totalDeductions: Double = iRPF + fonasa + frl + jubilatorio
    val netIncome: Double = salary - totalDeductions
    return netIncome
}

fun calculateIRPF(salary: Double): Double {

    val taxRate = when (salary) {
        in 0.00..34170.00 -> 0.00
        in 34171.00..52330.00 -> 0.10
        in 52331.00..87220.00 -> 0.15
        in 87221.00..174440.00 -> 0.22
        in 174441.00..290730.00 -> 0.25
        else -> 0.36
    }
    val iRPF = salary * taxRate
    return iRPF
}

fun calculateFONASA(salary: Double): Double {
    // 3 BPC as of September 2021
    val baseSalary = min(salary, 3 * 12961.00)  // 3 BPC as of September 2021
    val fonasaRate = 0.05 // Assuming the person doesn't have children
    val fonasa = baseSalary * fonasaRate
    return fonasa
}

fun calculateFRL(salary: Double): Double {
    val frlRate = 0.0010 // Example rate; this may vary, so consult official sources for accurate information
    val frl = salary * frlRate
    return frl
}

fun calculateJubilatorio(salary: Double): Double {
    val jubilatorioRate = 0.15
    val jubilatorio = salary * jubilatorioRate
    return jubilatorio
}