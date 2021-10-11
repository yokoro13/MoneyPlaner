package com.yokoro.moneyplaner.domain.usecase.actual.expenditure

import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class UpdateActualExpenditure (
    val repository: ActualExpenditureRepository
    ): IUseCase<Expenditure, Expenditure> {

    override fun execute(value: Expenditure): Either<Expenditure> =
        repository.updateActualExpenditure(value)

}