package com.yokoro.moneyplanner.domain.usecase.plan.expenditure

import com.yokoro.moneyplanner.domain.entity.Expenditure
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase

class GetExpectedExpenditure (
    val repository: ExpectedExpenditureRepository
    ): IUseCase<SearchRange, List<Expenditure>> {

    override fun execute(value: SearchRange): Either<List<Expenditure>> =
        repository.getExpectedExpenditure(value)

}