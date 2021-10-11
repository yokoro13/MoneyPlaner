package com.yokoro.moneyplanner.domain.usecase.plan.income

import com.yokoro.moneyplanner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase
import com.yokoro.moneyplanner.domain.entity.Income as Income

class RegisterExpectedIncome (
    val repository: ExpectedIncomeRepository
    ): IUseCase<Income, Income> {

    override fun execute(value: Income): Either<Income> =
        repository.registerExpectedIncome(value)

}