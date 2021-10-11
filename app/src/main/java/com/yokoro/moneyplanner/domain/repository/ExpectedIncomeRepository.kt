package com.yokoro.moneyplanner.domain.repository

import com.yokoro.moneyplanner.domain.entity.plan.ExpectedIncome
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.usecase.Either

interface ExpectedIncomeRepository {
    fun registerExpectedIncome(expectedIncome: ExpectedIncome): Either<ExpectedIncome>
    fun removeExpectedIncome(expectedIncome: ExpectedIncome): Either<ExpectedIncome>
    fun updateExpectedIncome(expectedIncome: ExpectedIncome): Either<ExpectedIncome>
    fun getExpectedIncome(range: SearchRange): Either<List<ExpectedIncome>>
}