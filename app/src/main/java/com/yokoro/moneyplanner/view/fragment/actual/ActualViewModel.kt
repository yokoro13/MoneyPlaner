package com.yokoro.moneyplanner.view.fragment.actual

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.yokoro.moneyplanner.domain.entity.actual.ActualExpenditure
import com.yokoro.moneyplanner.domain.entity.actual.ActualIncome
import com.yokoro.moneyplanner.domain.entity.shared.SearchRange
import com.yokoro.moneyplanner.domain.usecase.Either
import com.yokoro.moneyplanner.domain.usecase.actual.expenditure.GetActualExpenditure
import com.yokoro.moneyplanner.domain.usecase.actual.expenditure.RegisterActualExpenditure
import com.yokoro.moneyplanner.domain.usecase.actual.expenditure.RemoveActualExpenditure
import com.yokoro.moneyplanner.domain.usecase.actual.expenditure.UpdateActualExpenditure
import com.yokoro.moneyplanner.domain.usecase.actual.income.GetActualIncome
import com.yokoro.moneyplanner.domain.usecase.actual.income.RegisterActualIncome
import com.yokoro.moneyplanner.domain.usecase.actual.income.RemoveActualIncome
import com.yokoro.moneyplanner.domain.usecase.actual.income.UpdateActualIncome
import org.koin.core.KoinComponent
import org.koin.core.inject

class ActualViewModel:  ViewModel(), KoinComponent {

    private val getActualExpenditure: GetActualExpenditure by inject()
    private val registerActualExpenditure: RegisterActualExpenditure by inject()
    private val removeActualExpenditure: RemoveActualExpenditure by inject()
    private val updateActualExpenditure: UpdateActualExpenditure by inject()

    private val getActualIncome: GetActualIncome by inject()
    private val registerActualIncome: RegisterActualIncome by inject()
    private val removeActualIncome: RemoveActualIncome by inject()
    private val updateActualIncome: UpdateActualIncome by inject()

    private val _actualIncomes: MediatorLiveData<List<ActualIncome>> = MediatorLiveData()
    val actualIncomes: LiveData<List<ActualIncome>> = _actualIncomes

    private val _actualExpenditure: MediatorLiveData<List<ActualExpenditure>> = MediatorLiveData()
    val actualExpenditure: LiveData<List<ActualExpenditure>> = _actualExpenditure

    fun getActualExpenditure() {
        when (val actualExpenditure = getActualExpenditure.execute(SearchRange(Either.Empty(), Either.Empty()))) {
            is Either.Specify -> actualExpenditure.value.map {

            }
            else -> {

            }
        }
    }
}