package com.yokoro.moneyplaner.domain.usecase.actual.income

import com.yokoro.moneyplaner.domain.entity.Income
import com.yokoro.moneyplaner.domain.entity.SearchRange
import com.yokoro.moneyplaner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class GetActualIncome (
    val repository: ActualIncomeRepository
    ): IUseCase<SearchRange, List<Income>> {

    override fun execute(value: SearchRange): Either<List<Income>> =
        repository.getActualIncome(value)

}