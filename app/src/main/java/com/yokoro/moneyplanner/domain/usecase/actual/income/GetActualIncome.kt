package com.yokoro.moneyplanner.domain.usecase.actual.income

import com.yokoro.moneyplanner.domain.entity.actual.ActualIncome
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.repository.ActualIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase
import org.koin.core.KoinComponent
import org.koin.core.inject

class GetActualIncome: IUseCase<SearchRange, List<ActualIncome>>, KoinComponent {
    private val repository: ActualIncomeRepository by inject()

    override fun execute(value: SearchRange): Either<List<ActualIncome>> =
        repository.getActualIncome(value)

}