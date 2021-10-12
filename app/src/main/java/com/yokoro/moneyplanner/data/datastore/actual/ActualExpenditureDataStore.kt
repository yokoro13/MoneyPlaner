package com.yokoro.moneyplanner.data.datastore.actual

import com.yokoro.moneyplanner.di.AppDatabase
import com.yokoro.moneyplanner.data.database.actual.LocalActualExpenditure
import com.yokoro.moneyplanner.domain.entity.actual.ActualExpenditure
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import org.koin.core.KoinComponent
import org.koin.core.inject

class ActualExpenditureDataStore: ActualExpenditureRepository, KoinComponent {
    private val database: AppDatabase by inject()

    override fun registerActualExpenditure(actualExpenditure: ActualExpenditure): Either<ActualExpenditure> {
        database.actualExpenditureDao().insert(
            LocalActualExpenditure(
                id = 0,
                date = actualExpenditure.date.value,
                value = actualExpenditure.value.value,
                reason = when(val v = actualExpenditure.reason.value) {
                    is Either.Specify -> v.value
                    else -> null
                }
            )
        )

        return Either.Empty()
    }

    override fun removeActualExpenditure(actualExpenditure: ActualExpenditure): Either<ActualExpenditure> {
        TODO("Not yet implemented")
    }

    override fun updateActualExpenditure(actualExpenditure: ActualExpenditure): Either<ActualExpenditure> {
        TODO("Not yet implemented")
    }

    override fun getActualExpenditure(range: SearchRange): Either<List<ActualExpenditure>> {
        TODO("Not yet implemented")
    }

}