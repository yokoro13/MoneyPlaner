package com.yokoro.moneyplaner.domain.repository

import com.yokoro.moneyplaner.domain.entity.Date
import com.yokoro.moneyplaner.domain.entity.Expenditure
import com.yokoro.moneyplaner.domain.entity.Reason
import com.yokoro.moneyplaner.domain.entity.SearchRange
import com.yokoro.moneyplaner.domain.usecase.Either

interface ActualExpenditureRepository {
    fun registerActualExpenditure(value: Expenditure): Either<Expenditure>
    fun removeActualExpenditure(value: Expenditure): Either<Expenditure>
    fun updateActualExpenditure(value: Expenditure): Either<Expenditure>
    fun getActualExpenditure(range: SearchRange): Either<List<Expenditure>>
}