package com.yokoro.moneyplaner.domain.usecase.plan.income

import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class RemoveExpectedIncome (
    val repository: ExpectedIncomeRepository
    ): IUseCase<Income, Income> {

    override fun execute(value: Income): Either<Income> =
        repository.updateExpectedIncome(value)

}