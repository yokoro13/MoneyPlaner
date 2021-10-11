package com.yokoro.moneyplaner.domain.usecase.plan.income

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.entity.SearchRange
import com.yokoro.moneyplaner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class GetExpectedIncome (
    val repository: ExpectedIncomeRepository
    ): IUseCase<SearchRange, List<Income>> {

    override fun execute(value: SearchRange): Either<List<Income>> =
        repository.getExpectedIncome(value)

}