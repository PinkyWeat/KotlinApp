package com.savingscalc.calculator

import com.savingscalc.calculator.fakerepository.FakePersonDataStorage
import com.savingscalc.calculator.model.Person
import com.savingscalc.calculator.service.PersonServiceImpl
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CalculatorApplication

fun main() {
    val personNickname = "Harley"
    val repository: FakePersonDataStorage = FakePersonDataStorage
    val service: PersonServiceImpl = PersonServiceImpl()

    val person: Person? = repository.getPersonByNickname(personNickname)
    val netIncome = person?.let { service.calculatePersonNetIncome(it) }

    if (person != null) {
        val netIncomeString = netIncome?.toString() ?: "N/A"
        println("Net income after all taxes and deductions for ${person.nickname} is \$${netIncomeString} ")
    }

}
