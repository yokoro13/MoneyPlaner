package com.yokoro.moneyplanner.domain.repository

import com.yokoro.moneyplanner.domain.entity.actual.ActualExpenditure
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.usecase.Either

interface ActualExpenditureRepository {
    fun registerActualExpenditure(actualExpenditure: ActualExpenditure): Either<ActualExpenditure>
    fun removeActualExpenditure(actualExpenditure: ActualExpenditure): Either<ActualExpenditure>
    fun updateActualExpenditure(actualExpenditure: ActualExpenditure): Either<ActualExpenditure>
    fun getActualExpenditure(range: SearchRange): Either<List<ActualExpenditure>>
}