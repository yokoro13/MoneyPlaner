package com.yokoro.moneyplanner.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yokoro.moneyplanner.data.database.actual.LocalActualExpenditure
import com.yokoro.moneyplanner.data.database.actual.LocalActualIncome
import com.yokoro.moneyplanner.data.database.actual.dao.ActualExpenditureDao
import com.yokoro.moneyplanner.data.database.actual.dao.ActualIncomeDao
import com.yokoro.moneyplanner.data.database.plan.LocalExpectedExpenditure
import com.yokoro.moneyplanner.data.database.plan.LocalExpectedIncome
import com.yokoro.moneyplanner.data.database.plan.dao.ExpectedExpenditureDao
import com.yokoro.moneyplanner.data.database.plan.dao.ExpectedIncomeDao

@Database(
    entities = [
        LocalActualExpenditure::class,
        LocalActualIncome::class,
        LocalExpectedExpenditure::class,
        LocalExpectedIncome::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun actualExpenditureDao(): ActualExpenditureDao
    abstract fun actualIncomeDao(): ActualIncomeDao
    abstract fun expectedExpenditureDao(): ExpectedExpenditureDao
    abstract fun expectedIncomeDao(): ExpectedIncomeDao

    companion object{
        @Volatile private var instance: AppDatabase? = null
        private const val databaseName = "moneyplaner.db"

        fun getInstance(context: Context): AppDatabase =
            instance ?: synchronized(this) {
                Room.databaseBuilder(context,
                    AppDatabase::class.java, databaseName)
                    .build()
            }
    }
}