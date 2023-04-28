package com.savingscalc.calculator.model

data class Person (
    val nickname: String,
    var salary: Double,
    val savings: Int
) {
    init {
        require(nickname.isNotEmpty() && nickname.length > 2){ "nickname is blank" }
        require(salary >= 1000) {"salary must not be less than 1000"}
        require(savings > 50 && savings < salary) {"savings value must not be less than 50"}
    }
}