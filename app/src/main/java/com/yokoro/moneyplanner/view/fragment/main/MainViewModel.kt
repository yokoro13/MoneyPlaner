package com.yokoro.moneyplanner.view.fragment.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import com.yokoro.moneyplanner.domain.entity.actual.ActualIncome

class MainViewModel : ViewModel() {

    private val _actualIncomes: MediatorLiveData<List<ActualIncome>> = MediatorLiveData()
    val actualIncomes: LiveData<List<ActualIncome>> = _actualIncomes
}