package com.yokoro.moneyplaner.domain.repository

import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.entity.SearchRange
import com.yokoro.moneyplaner.domain.usecase.Either

interface ExpectedExpenditureRepository {
    fun registerExpectedExpenditure(value: Expenditure): Either<Expenditure>
    fun removeExpectedExpenditure(value: Expenditure): Either<Expenditure>
    fun updateExpectedExpenditure(value: Expenditure): Either<Expenditure>
    fun getExpectedExpenditure(range: SearchRange): Either<List<Expenditure>>
}