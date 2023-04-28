package com.savingscalc.calculator.service

import com.savingscalc.calculator.fakerepository.FakePersonDataStorage
import com.savingscalc.calculator.model.Person
import com.savingscalc.calculator.util.TaxCalculator

class PersonServiceImpl: PersonService {

    private val fakePerson: FakePersonDataStorage = FakePersonDataStorage

    override fun savePerson(person: Person) {
        TODO("Not yet implemented")
    }

    override fun updatePerson(person: Person) {
        TODO("Not yet implemented")
    }

    override fun deletePerson(person: Person) {
        TODO("Not yet implemented")
    }

    override fun getPersonByNickname(nickname: String): Person? {
        TODO("Not yet implemented")
    }

    override fun calculatePersonNetIncome(person: Person): Double {
        val netIncome = TaxCalculator(person.salary)
        return netIncome
    }

    override fun calculatePersonSavings(person: Person) {
        TODO("Not yet implemented")
    }
}