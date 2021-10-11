package com.yokoro.moneyplaner.domain.usecase.plan.expenditure

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.repository.ExpectedExpenditureRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase
import com.yokoro.moneyplaner.domain.usecase.None

class RegisterExpectedExpenditure (
    val repository: ExpectedExpenditureRepository
    ): IUseCase<Expenditure, Expenditure> {

    override fun execute(value: Expenditure): Either<Expenditure> =
        repository.registerExpectedExpenditure(value)

}