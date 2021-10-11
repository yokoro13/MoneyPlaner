package com.yokoro.moneyplaner.domain.usecase.plan

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class GetExpectedIncome (
    val repository: ExpectedIncomeRepository
    ): IUseCase<Date, Income> {

    override fun execute(value: Date): Either<Income> {
        return repository.getExpectedIncome(value)
    }
}