package com.yokoro.moneyplanner.domain.usecase.plan.income

import com.yokoro.moneyplanner.domain.entity.Income
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase

class GetExpectedIncome (
    val repository: ExpectedIncomeRepository
    ): IUseCase<SearchRange, List<Income>> {

    override fun execute(value: SearchRange): Either<List<Income>> =
        repository.getExpectedIncome(value)

}