package com.yokoro.moneyplaner.domain.repository

import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.entity.SearchRange
import com.yokoro.moneyplaner.domain.usecase.Either

interface ActualIncomeRepository {
    fun registerActualIncome(value: Income): Either<Income>
    fun removeActualIncome(value: Income): Either<Income>
    fun updateActualIncome(value: Income): Either<Income>
    fun getActualIncome(range: SearchRange): Either<List<Income>>
}
