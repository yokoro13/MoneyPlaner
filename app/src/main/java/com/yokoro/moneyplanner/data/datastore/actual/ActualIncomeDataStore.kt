package com.yokoro.moneyplanner.data.datastore.actual

import com.yokoro.moneyplanner.domain.entity.Income
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either

class ActualIncomeDataStore: ActualIncomeRepository {
    override fun registerActualIncome(value: Income): Either<Income> {
        TODO("Not yet implemented")
    }

    override fun removeActualIncome(value: Income): Either<Income> {
        TODO("Not yet implemented")
    }

    override fun updateActualIncome(value: Income): Either<Income> {
        TODO("Not yet implemented")
    }

    override fun getActualIncome(range: SearchRange): Either<List<Income>> {
        TODO("Not yet implemented")
    }

}