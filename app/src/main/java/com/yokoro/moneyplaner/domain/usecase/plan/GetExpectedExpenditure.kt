package com.yokoro.moneyplaner.domain.usecase.plan

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class GetExpectedExpenditure (
    val repository: ExpectedExpenditureRepository
    ): IUseCase<Date, Expenditure> {

    override fun execute(value: Date): Either<Expenditure> {
        return repository.getExpectedExpenditure(value)
    }
}