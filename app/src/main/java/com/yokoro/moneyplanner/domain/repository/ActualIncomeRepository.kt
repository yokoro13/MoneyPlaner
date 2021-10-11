package com.yokoro.moneyplanner.domain.repository

import com.yokoro.moneyplanner.domain.entity.actual.ActualIncome
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.usecase.Either

interface ActualIncomeRepository {
    fun registerActualIncome(actualIncome: ActualIncome): Either<ActualIncome>
    fun removeActualIncome(actualIncome: ActualIncome): Either<ActualIncome>
    fun updateActualIncome(actualIncome: ActualIncome): Either<ActualIncome>
    fun getActualIncome(range: SearchRange): Either<List<ActualIncome>>
}
