package com.yokoro.moneyplanner.domain.repository

import com.yokoro.moneyplanner.domain.entity.Income
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.usecase.Either

interface ActualIncomeRepository {
    fun registerActualIncome(value: Income): Either<Income>
    fun removeActualIncome(value: Income): Either<Income>
    fun updateActualIncome(value: Income): Either<Income>
    fun getActualIncome(range: SearchRange): Either<List<Income>>
}
