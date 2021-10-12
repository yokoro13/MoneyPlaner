package com.yokoro.moneyplanner.di

import android.app.Application
import com.yokoro.moneyplanner.data.datastore.actual.ActualExpenditureDataStore
import com.yokoro.moneyplanner.data.datastore.actual.ActualIncomeDataStore
import com.yokoro.moneyplanner.data.datastore.plan.ExpectedExpenditureDataStore
import com.yokoro.moneyplanner.data.datastore.plan.ExpectedIncomeDataStore
import com.yokoro.moneyplanner.domain.repository.ActualExpenditureRepository
import com.yokoro.moneyplanner.domain.usecase.actual.expenditure.GetActualExpenditure
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

private val appModule = module {
}

private val usecaseModule = module {
    // factory { GetActualExpenditure() }
}

private val repositoryModule = module {
    factory { ActualExpenditureDataStore() }
    factory { ActualIncomeDataStore() }
    factory { ExpectedExpenditureDataStore() }
    factory { ExpectedIncomeDataStore() }
}

private val localModule = module {
    single { AppDatabase.getInstance(androidContext() as Application) }
}

val diModules = listOf(
    appModule,
    usecaseModule,
    repositoryModule,
    localModule
)