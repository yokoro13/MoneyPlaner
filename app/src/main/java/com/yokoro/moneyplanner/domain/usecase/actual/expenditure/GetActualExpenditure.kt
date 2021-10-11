package com.yokoro.moneyplanner.domain.usecase.actual.expenditure

import com.yokoro.moneyplanner.domain.entity.Expenditure
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase

class GetActualExpenditure (
    val repository: ActualExpenditureRepository
): IUseCase<SearchRange, List<Expenditure>> {

    override fun execute(value: SearchRange): Either<List<Expenditure>> =
        repository.getActualExpenditure(value)

}