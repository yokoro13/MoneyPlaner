package com.yokoro.moneyplanner.domain.usecase.actual.income

import com.yokoro.moneyplanner.domain.entity.Income
import com.yokoro.moneyplanner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase

class RegisterActualIncome (
    val repository: ActualIncomeRepository
    ): IUseCase<Income, Income> {

    override fun execute(value: Income): Either<Income> =
        repository.registerActualIncome(value)

}