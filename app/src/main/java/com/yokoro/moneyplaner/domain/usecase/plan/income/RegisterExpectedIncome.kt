package com.yokoro.moneyplaner.domain.usecase.plan.income

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase
import com.yokoro.moneyplaner.domain.entity.Income as Income

class RegisterExpectedIncome (
    val repository: ExpectedIncomeRepository
    ): IUseCase<Income, Income> {

    override fun execute(value: Income): Either<Income> =
        repository.registerExpectedIncome(value)

}