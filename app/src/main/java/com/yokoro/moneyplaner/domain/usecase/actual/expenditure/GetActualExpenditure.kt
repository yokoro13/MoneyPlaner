package com.yokoro.moneyplaner.domain.usecase.actual.expenditure

import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.entity.SearchRange
import com.yokoro.moneyplaner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class GetActualExpenditure (
    val repository: ActualExpenditureRepository
): IUseCase<SearchRange, List<Expenditure>> {

    override fun execute(value: SearchRange): Either<List<Expenditure>> =
        repository.getActualExpenditure(value)

}