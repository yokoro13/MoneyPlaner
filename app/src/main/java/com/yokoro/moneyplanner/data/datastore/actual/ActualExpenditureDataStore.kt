package com.yokoro.moneyplanner.data.datastore.actual

import com.yokoro.moneyplanner.domain.entity.Expenditure
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either

class ActualExpenditureDataStore: ActualExpenditureRepository {
    override fun registerActualExpenditure(value: Expenditure): Either<Expenditure> {
        TODO("Not yet implemented")
    }

    override fun removeActualExpenditure(value: Expenditure): Either<Expenditure> {
        TODO("Not yet implemented")
    }

    override fun updateActualExpenditure(value: Expenditure): Either<Expenditure> {
        TODO("Not yet implemented")
    }

    override fun getActualExpenditure(range: SearchRange): Either<List<Expenditure>> {
        TODO("Not yet implemented")
    }

}