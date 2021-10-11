package com.yokoro.moneyplanner.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yokoro.moneyplanner.data.database.actual.ActualExpenditure
import com.yokoro.moneyplanner.data.database.actual.ActualIncome
import com.yokoro.moneyplanner.data.database.actual.dao.ActualExpenditureDao
import com.yokoro.moneyplanner.data.database.actual.dao.ActualIncomeDao
import com.yokoro.moneyplanner.data.database.plan.ExpectedExpenditure
import com.yokoro.moneyplanner.data.database.plan.ExpectedIncome
import com.yokoro.moneyplanner.data.database.plan.dao.ExpectedExpenditureDao
import com.yokoro.moneyplanner.data.database.plan.dao.ExpectedIncomeDao

@Database(
    entities = [
        ActualExpenditure::class,
        ActualIncome::class,
        ExpectedExpenditure::class,
        ExpectedIncome::class],
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