package com.yokoro.moneyplanner.domain.repository

import com.yokoro.moneyplanner.domain.entity.plan.ExpectedExpenditure
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.usecase.Either

interface ExpectedExpenditureRepository {
    fun registerExpectedExpenditure(expectedExpenditure: ExpectedExpenditure): Either<ExpectedExpenditure>
    fun removeExpectedExpenditure(expectedExpenditure: ExpectedExpenditure): Either<ExpectedExpenditure>
    fun updateExpectedExpenditure(expectedExpenditure: ExpectedExpenditure): Either<ExpectedExpenditure>
    fun getExpectedExpenditure(range: SearchRange): Either<List<ExpectedExpenditure>>
}