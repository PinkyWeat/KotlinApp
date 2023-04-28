package com.savingscalc.calculator.fakerepository

import com.savingscalc.calculator.model.Person

object FakePersonDataStorage {
    private val personProfiles: MutableList<Person> = mutableListOf()

    init {
        personProfiles.add(Person("Harley", 29000.00, 2000))
        personProfiles.add(Person("Bear", 34000.00, 5000))
        personProfiles.add(Person("CoffeeLover", 35000.00, 9000))
    }

    fun getPersonProfiles(): List<Person> {
        return personProfiles.toList()
    }

    fun getPersonByNickname(personNickname: String): Person? {
        return personProfiles.find { it.nickname == personNickname }
    }
}




