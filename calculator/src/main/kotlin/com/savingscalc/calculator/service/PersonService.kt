package com.savingscalc.calculator.service

import com.savingscalc.calculator.model.Person

interface PersonService {
    // se le puede poner implementciones por defecto
    fun savePerson(person: Person)
    fun updatePerson(person: Person)
    fun deletePerson(person: Person)
    fun getPersonByNickname(nickname: String): Person?

    fun calculatePersonNetIncome(person: Person): Double
    fun calculatePersonSavings(person: Person)
}