package com.yokoro.moneyplanner.domain.repository

import com.yokoro.moneyplanner.domain.entity.Expenditure
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.usecase.Either

interface ExpectedExpenditureRepository {
    fun registerExpectedExpenditure(value: Expenditure): Either<Expenditure>
    fun removeExpectedExpenditure(value: Expenditure): Either<Expenditure>
    fun updateExpectedExpenditure(value: Expenditure): Either<Expenditure>
    fun getExpectedExpenditure(range: SearchRange): Either<List<Expenditure>>
}