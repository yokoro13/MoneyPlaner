package com.yokoro.moneyplanner.data.datastore.plan

import com.yokoro.moneyplanner.data.database.AppDatabase
import com.yokoro.moneyplanner.data.database.plan.LocalExpectedExpenditure
import com.yokoro.moneyplanner.domain.entity.plan.ExpectedExpenditure
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import org.koin.core.KoinComponent
import org.koin.core.inject

class ExpectedExpenditureDataStore: ExpectedExpenditureRepository, KoinComponent {
    private val database: AppDatabase by inject()

    override fun registerExpectedExpenditure(expectedExpenditure: ExpectedExpenditure): Either<ExpectedExpenditure> {
        database.expectedExpenditureDao().insert(
            LocalExpectedExpenditure(
                id = 0,
                date = expectedExpenditure.date.value,
                value = expectedExpenditure.value.value,
                reason = when(val v = expectedExpenditure.reason.value) {
                    is Either.Specify -> v.value
                    else -> null
                }
            )
        )

        return Either.Empty()
    }

    override fun removeExpectedExpenditure(expectedExpenditure: ExpectedExpenditure): Either<ExpectedExpenditure> {
        TODO("Not yet implemented")
    }

    override fun updateExpectedExpenditure(expectedExpenditure: ExpectedExpenditure): Either<ExpectedExpenditure> {
        TODO("Not yet implemented")
    }

    override fun getExpectedExpenditure(range: SearchRange): Either<List<ExpectedExpenditure>> {
        TODO("Not yet implemented")
    }

}