package com.yokoro.moneyplanner.data.datastore.actual

import com.yokoro.moneyplanner.di.AppDatabase
import com.yokoro.moneyplanner.data.database.actual.LocalActualIncome
import com.yokoro.moneyplanner.domain.entity.actual.ActualIncome
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import org.koin.core.KoinComponent
import org.koin.core.inject

class ActualIncomeDataStore: ActualIncomeRepository, KoinComponent {
    private val database: AppDatabase by inject()

    override fun registerActualIncome(actualIncome: ActualIncome): Either<ActualIncome> {
        database.actualIncomeDao().insert(
            LocalActualIncome(
                id = 0,
                date = actualIncome.date.value,
                value = actualIncome.value.value,
                reason = when(val v = actualIncome.reason.value) {
                    is Either.Specify -> v.value
                    else -> null
                }
            )
        )

        return Either.Empty()
    }

    override fun removeActualIncome(actualIncome: ActualIncome): Either<ActualIncome> {
        TODO("Not yet implemented")
    }

    override fun updateActualIncome(actualIncome: ActualIncome): Either<ActualIncome> {
        TODO("Not yet implemented")
    }

    override fun getActualIncome(range: SearchRange): Either<List<ActualIncome>> {
        TODO("Not yet implemented")
    }

}