package com.yokoro.moneyplanner.data.datastore.actual

import com.yokoro.moneyplanner.di.AppDatabase
import com.yokoro.moneyplanner.data.database.actual.LocalActualExpenditure
import com.yokoro.moneyplanner.domain.entity.actual.ActualExpenditure
import com.yokoro.moneyplanner.domain.entity.plan.ExpectedIncome
import com.yokoro.moneyplanner.domain.entity.shared.Date
import com.yokoro.moneyplanner.domain.entity.shared.Expenditure
import com.yokoro.moneyplanner.domain.entity.shared.Reason
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import org.koin.core.KoinComponent
import org.koin.core.inject
import java.security.InvalidParameterException

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
        database.actualExpenditureDao().delete(
            id = actualExpenditure.id
        )

        return Either.Empty()
    }

    override fun updateActualExpenditure(actualExpenditure: ActualExpenditure): Either<ActualExpenditure> {
        database.actualExpenditureDao().update(
            id = actualExpenditure.id,
            date = actualExpenditure.date.value,
            value = actualExpenditure.value.value,
            reason = when(val v = actualExpenditure.reason.value) {
                is Either.Specify -> v.value
                else -> ""
            }
        )

        return Either.Empty()
    }

    override fun getActualExpenditure(range: SearchRange): Either<List<ActualExpenditure>> {
        return Either.Specify(database.actualExpenditureDao().getActualExpenditureBetween(
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
        ).map { actualExpenditure ->
            ActualExpenditure(
                id = actualExpenditure.id,
                date = Date(actualExpenditure.date),
                reason = Reason(
                    actualExpenditure.reason?.let {
                        Either.Specify(it)
                    } ?: Either.Empty()
                ),
                value = Expenditure(actualExpenditure.value)
            )
        })
    }

}