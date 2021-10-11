package com.yokoro.moneyplaner.domain.repository

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.usecase.Either

interface ExpectedExpenditureRepository {
    fun registerExpectedExpenditure(value: Expenditure): Either<Expenditure>
    fun getExpectedExpenditure(date: Date): Either<Expenditure>
}