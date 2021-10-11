package com.yokoro.moneyplanner.domain.usecase.plan.expenditure

import com.yokoro.moneyplanner.domain.entity.plan.ExpectedExpenditure
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase
import org.koin.core.KoinComponent
import org.koin.core.inject

class GetExpectedExpenditure: IUseCase<SearchRange, List<ExpectedExpenditure>>, KoinComponent {
    private val repository: ExpectedExpenditureRepository by inject()

    override fun execute(value: SearchRange): Either<List<ExpectedExpenditure>> =
        repository.getExpectedExpenditure(value)

}