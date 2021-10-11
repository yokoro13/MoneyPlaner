package com.yokoro.moneyplanner.domain.usecase.actual.expenditure

import com.yokoro.moneyplanner.domain.entity.actual.ActualExpenditure
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase
import org.koin.core.KoinComponent
import org.koin.core.inject

class GetActualExpenditure: IUseCase<SearchRange, List<ActualExpenditure>>, KoinComponent {
    private val repository: ActualExpenditureRepository by inject()

    override fun execute(value: SearchRange): Either<List<ActualExpenditure>> =
        repository.getActualExpenditure(value)

}