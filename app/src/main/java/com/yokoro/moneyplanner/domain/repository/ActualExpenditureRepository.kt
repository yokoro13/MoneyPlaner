package com.yokoro.moneyplanner.domain.repository

import com.yokoro.moneyplanner.domain.entity.Expenditure
import com.yokoro.moneyplanner.domain.entity.SearchRange
import com.yokoro.moneyplanner.domain.usecase.Either

interface ActualExpenditureRepository {
    fun registerActualExpenditure(value: Expenditure): Either<Expenditure>
    fun removeActualExpenditure(value: Expenditure): Either<Expenditure>
    fun updateActualExpenditure(value: Expenditure): Either<Expenditure>
    fun getActualExpenditure(range: SearchRange): Either<List<Expenditure>>
}