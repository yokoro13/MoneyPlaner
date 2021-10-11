package com.yokoro.moneyplaner.domain.usecase.actual.income

import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class UpdateActualIncome (
    val repository: ActualIncomeRepository
    ): IUseCase<Income, Income> {

    override fun execute(value: Income): Either<Income> =
        repository.updateActualIncome(value)

}