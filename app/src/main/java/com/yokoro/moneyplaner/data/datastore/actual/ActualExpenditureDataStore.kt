package com.yokoro.moneyplaner.data.datastore.actual

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplaner.domain.usecase.Either

class ActualExpenditureDataStore: ActualExpenditureRepository {
    override fun registerActualExpenditure(value: Expenditure): Either<Expenditure> {
        TODO("Not yet implemented")
    }

    override fun getActualExpenditure(date: Date): Either<Expenditure> {
        TODO("Not yet implemented")
    }
}