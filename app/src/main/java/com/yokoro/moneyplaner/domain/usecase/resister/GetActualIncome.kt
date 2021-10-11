package com.yokoro.moneyplaner.domain.usecase.resister

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class GetActualIncome (
    val repository: ActualIncomeRepository
): IUseCase<Date, Income> {

    override fun execute(value: Date): Either<Income> {
        return repository.getActualIncome(value)
    }
}