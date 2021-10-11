package com.yokoro.moneyplaner.domain.usecase.resister

import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class RegisterActualIncome (
    val repository: ActualIncomeRepository
): IUseCase<Income, Income> {

    override fun execute(value: Income): Either<Income> {
        return repository.registerActualIncome(value)
    }
}