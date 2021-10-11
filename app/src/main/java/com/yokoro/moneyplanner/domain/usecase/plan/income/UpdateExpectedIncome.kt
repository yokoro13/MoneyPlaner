package com.yokoro.moneyplanner.domain.usecase.plan.income

import com.yokoro.moneyplanner.domain.entity.Income
import com.yokoro.moneyplanner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase

class UpdateExpectedIncome (
    val repository: ExpectedIncomeRepository
    ): IUseCase<Income, Income> {

    override fun execute(value: Income): Either<Income> =
        repository.updateExpectedIncome(value)

}