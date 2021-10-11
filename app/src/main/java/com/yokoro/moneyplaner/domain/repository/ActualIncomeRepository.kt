package com.yokoro.moneyplaner.domain.repository

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.usecase.Either

interface ActualIncomeRepository {
    fun registerActualIncome(value: Income): Either<Income>
    fun getActualIncome(date: Date): Either<Income>
}
