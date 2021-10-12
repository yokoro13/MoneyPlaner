package com.yokoro.moneyplanner.data.datastore.actual

import com.yokoro.moneyplanner.di.AppDatabase
import com.yokoro.moneyplanner.data.database.actual.LocalActualIncome
import com.yokoro.moneyplanner.domain.entity.actual.ActualIncome
import com.yokoro.moneyplanner.domain.entity.plan.ExpectedIncome
import com.yokoro.moneyplanner.domain.entity.shared.*
import com.yokoro.moneyplanner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import org.koin.core.KoinComponent
import org.koin.core.inject
import java.security.InvalidParameterException

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
        database.actualIncomeDao().delete(
            id = actualIncome.id
        )

        return Either.Empty()
    }

    override fun updateActualIncome(actualIncome: ActualIncome): Either<ActualIncome> {
        database.actualIncomeDao().update(
            id = actualIncome.id,
            date = actualIncome.date.value,
            value = actualIncome.value.value,
            reason = when(val v = actualIncome.reason.value) {
                is Either.Specify -> v.value
                else -> ""
            }
        )

        return Either.Empty()
    }

    override fun getActualIncome(range: SearchRange): Either<List<ActualIncome>> {
        return Either.Specify(database.actualIncomeDao().getActualIncomeBetween(
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
        ).map { actualIncome ->
            ActualIncome(
                id = actualIncome.id,
                date = Date(actualIncome.date),
                reason = Reason(
                    actualIncome.reason?.let {
                        Either.Specify(it)
                    } ?: Either.Empty()
                ),
                value = Income(actualIncome.value)
            )
        })
    }

}