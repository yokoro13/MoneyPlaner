package com.yokoro.moneyplanner.data.datastore.plan

import com.yokoro.moneyplanner.domain.entity.Expenditure
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either

class ExpectedExpenditureDataStore: ExpectedExpenditureRepository {
    override fun registerExpectedExpenditure(value: Expenditure): Either<Expenditure> {
        TODO("Not yet implemented")
    }

    override fun removeExpectedExpenditure(value: Expenditure): Either<Expenditure> {
        TODO("Not yet implemented")
    }

    override fun updateExpectedExpenditure(value: Expenditure): Either<Expenditure> {
        TODO("Not yet implemented")
    }

    override fun getExpectedExpenditure(range: SearchRange): Either<List<Expenditure>> {
        TODO("Not yet implemented")
    }

}