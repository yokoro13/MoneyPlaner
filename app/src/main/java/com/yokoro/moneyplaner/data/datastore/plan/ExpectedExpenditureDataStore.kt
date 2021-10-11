package com.yokoro.moneyplaner.data.datastore.plan

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplaner.domain.usecase.Either

class ExpectedExpenditureDataStore: ExpectedExpenditureRepository {
    override fun registerExpectedExpenditure(value: Expenditure): Either<Expenditure> {
        TODO("Not yet implemented")
    }

    override fun getExpectedExpenditure(date: Date): Either<Expenditure> {
        TODO("Not yet implemented")
    }
}