package com.yokoro.moneyplaner.data.datastore.plan

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either

class ExpectedIncomeDataStore: ExpectedIncomeRepository {
    override fun registerExpectedIncome(value: Income): Either<Income> {
        TODO("Not yet implemented")
    }

    override fun getExpectedIncome(date: Date): Either<Income> {
        TODO("Not yet implemented")
    }
}