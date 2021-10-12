package com.yokoro.moneyplanner.data.datastore.plan

import com.yokoro.moneyplanner.di.AppDatabase
import com.yokoro.moneyplanner.data.database.plan.LocalExpectedExpenditure
import com.yokoro.moneyplanner.domain.entity.plan.ExpectedExpenditure
import com.yokoro.moneyplanner.domain.entity.plan.ExpectedIncome
import com.yokoro.moneyplanner.domain.entity.shared.Date
import com.yokoro.moneyplanner.domain.entity.shared.Expenditure
import com.yokoro.moneyplanner.domain.entity.shared.Reason
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import org.koin.core.KoinComponent
import org.koin.core.inject
import java.security.InvalidParameterException

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
        database.expectedExpenditureDao().delete(
            id = expectedExpenditure.id
        )

        return Either.Empty()
    }

    override fun updateExpectedExpenditure(expectedExpenditure: ExpectedExpenditure): Either<ExpectedExpenditure> {
        database.expectedExpenditureDao().update(
            id = expectedExpenditure.id,
            date = expectedExpenditure.date.value,
            value = expectedExpenditure.value.value,
            reason = when(val v = expectedExpenditure.reason.value) {
                is Either.Specify -> v.value
                else -> ""
            }
        )

        return Either.Empty()
    }

    override fun getExpectedExpenditure(range: SearchRange): Either<List<ExpectedExpenditure>> {
        return Either.Specify(database.expectedExpenditureDao().getExpectedExpenditureBetween(
            when(val f = range.from) {
                is Either.Specify -> f.value.value
                else -> {
                    when(val t = range.to) {
                        is Either.Specify -> t.value.value
                        else -> throw InvalidParameterException("Parameter is necessary")
                    }
                }
            },
            when(val t = range.to) {
                is Either.Specify -> t.value.value
                else -> {
                    when(val f = range.from) {
                        is Either.Specify -> f.value.value
                        else -> throw InvalidParameterException("Parameter is necessary")
                    }
                }
            }
        ).map { expectedExpenditure ->
            ExpectedExpenditure(
                id = expectedExpenditure.id,
                date = Date(expectedExpenditure.date),
                reason = Reason(
                    expectedExpenditure.reason?.let {
                        Either.Specify(it)
                    } ?: Either.Empty()
                ),
                value = Expenditure(expectedExpenditure.value)
            )
        })
    }

}