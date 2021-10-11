package com.yokoro.moneyplanner.data.datastore.plan

import com.yokoro.moneyplanner.domain.entity.Income
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either

class ExpectedIncomeDataStore: ExpectedIncomeRepository {
    override fun registerExpectedIncome(value: Income): Either<Income> {
        // AppDatabase.getInstance().expectedIncomeDao().insert()
        TODO("Not yet implemented")
    }

    override fun removeExpectedIncome(value: Income): Either<Income> {
        TODO("Not yet implemented")
    }

    override fun updateExpectedIncome(value: Income): Either<Income> {
        TODO("Not yet implemented")
    }

    override fun getExpectedIncome(range: SearchRange): Either<List<Income>> {
        TODO("Not yet implemented")
    }

}