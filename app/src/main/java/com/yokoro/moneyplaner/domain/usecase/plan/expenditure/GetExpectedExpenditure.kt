package com.yokoro.moneyplaner.domain.usecase.plan.expenditure

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.entity.SearchRange
import com.yokoro.moneyplaner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class GetExpectedExpenditure (
    val repository: ExpectedExpenditureRepository
    ): IUseCase<SearchRange, List<Expenditure>> {

    override fun execute(value: SearchRange): Either<List<Expenditure>> =
        repository.getExpectedExpenditure(value)

}