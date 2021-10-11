package com.yokoro.moneyplaner.domain.repository

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.usecase.Either

interface ActualExpenditureRepository {
    fun registerActualExpenditure(value: Expenditure): Either<Expenditure>
    fun getActualExpenditure(date: Date): Either<Expenditure>
}