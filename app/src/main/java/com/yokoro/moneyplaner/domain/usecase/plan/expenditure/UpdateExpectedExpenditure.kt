package com.yokoro.moneyplaner.domain.usecase.plan.expenditure

import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class UpdateExpectedExpenditure(
    val repository: ExpectedExpenditureRepository
    ): IUseCase<Expenditure, Expenditure> {

    override fun execute(value: Expenditure): Either<Expenditure> =
        repository.updateExpectedExpenditure(value)

}