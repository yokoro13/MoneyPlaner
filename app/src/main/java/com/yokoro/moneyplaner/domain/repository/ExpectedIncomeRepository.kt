package com.yokoro.moneyplaner.domain.repository

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.usecase.Either

interface ExpectedIncomeRepository {
    fun registerExpectedIncome(value: Income): Either<Income>
    fun getExpectedIncome(date: Date): Either<Income>
}