package com.yokoro.moneyplanner.domain.usecase.actual.income

import com.yokoro.moneyplanner.domain.entity.Income
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase

class GetActualIncome (
    val repository: ActualIncomeRepository
    ): IUseCase<SearchRange, List<Income>> {

    override fun execute(value: SearchRange): Either<List<Income>> =
        repository.getActualIncome(value)

}