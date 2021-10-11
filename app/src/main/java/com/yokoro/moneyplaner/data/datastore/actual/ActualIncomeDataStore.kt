package com.yokoro.moneyplaner.data.datastore.actual

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either

class ActualIncomeDataStore: ActualIncomeRepository {
    override fun registerActualIncome(value: Income): Either<Income> {
        TODO("Not yet implemented")
    }

    override fun getActualIncome(date: Date): Either<Income> {
        TODO("Not yet implemented")
    }
}