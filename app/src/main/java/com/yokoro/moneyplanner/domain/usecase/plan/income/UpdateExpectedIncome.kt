package com.yokoro.moneyplanner.domain.usecase.plan.income

import com.yokoro.moneyplanner.domain.entity.plan.ExpectedIncome
import com.yokoro.moneyplanner.domain.repository.ExpectedIncomeRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase
import org.koin.core.KoinComponent
import org.koin.core.inject

class UpdateExpectedIncome: IUseCase<ExpectedIncome, ExpectedIncome>, KoinComponent {
    private val repository: ExpectedIncomeRepository by inject()

    override fun execute(value: ExpectedIncome): Either<ExpectedIncome> =
        repository.updateExpectedIncome(value)

}