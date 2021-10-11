package com.yokoro.moneyplaner.domain.usecase.resister

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplaner.domain.usecase.Either
import com.yokoro.moneyplaner.domain.usecase.IUseCase

class GetActualExpenditure (
    val repository: ActualExpenditureRepository
): IUseCase<Date, Expenditure> {

    override fun execute(value: Date): Either<Expenditure> {
        return repository.getActualExpenditure(value)
    }
}