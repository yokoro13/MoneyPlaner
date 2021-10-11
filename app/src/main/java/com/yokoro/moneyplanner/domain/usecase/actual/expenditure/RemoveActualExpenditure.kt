package com.yokoro.moneyplanner.domain.usecase.actual.expenditure

import com.yokoro.moneyplanner.domain.entity.actual.ActualExpenditure
import com.yokoro.moneyplanner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.IUseCase
import org.koin.core.KoinComponent
import org.koin.core.inject

class RemoveActualExpenditure: IUseCase<ActualExpenditure, ActualExpenditure>, KoinComponent {
    private val repository: ActualExpenditureRepository by inject()

    override fun execute(value: ActualExpenditure): Either<ActualExpenditure> =
        repository.removeActualExpenditure(value)

}