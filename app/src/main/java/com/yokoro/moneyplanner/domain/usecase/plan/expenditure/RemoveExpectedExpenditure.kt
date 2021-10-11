package com.yokoro.moneyplanner.domain.usecase.plan.expenditure

import com.yokoro.moneyplanner.domain.entity.Expenditure
import com.yokoro.moneyplanner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase

class RemoveExpectedExpenditure (
    val repository: ExpectedExpenditureRepository
    ): IUseCase<Expenditure, Expenditure> {

    override fun execute(value: Expenditure): Either<Expenditure> =
        repository.removeExpectedExpenditure(value)

}