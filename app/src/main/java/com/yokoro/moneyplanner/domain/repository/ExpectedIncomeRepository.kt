package com.yokoro.moneyplanner.domain.repository

import com.yokoro.moneyplanner.domain.entity.Income
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.usecase.Either

interface ExpectedIncomeRepository {
    fun registerExpectedIncome(value: Income): Either<Income>
    fun removeExpectedIncome(value: Income): Either<Income>
    fun updateExpectedIncome(value: Income): Either<Income>
    fun getExpectedIncome(range: SearchRange): Either<List<Income>>
}