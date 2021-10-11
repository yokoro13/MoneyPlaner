package com.yokoro.moneyplanner.domain.usecase.actual.expenditure

import com.yokoro.moneyplanner.domain.entity.Expenditure
import com.yokoro.moneyplanner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase

class RegisterActualExpenditure (
    val repository: ActualExpenditureRepository
): IUseCase<Expenditure, Expenditure> {

    override fun execute(value: Expenditure): Either<Expenditure> =
        repository.registerActualExpenditure(value)

}