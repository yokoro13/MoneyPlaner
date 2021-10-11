package com.yokoro.moneyplanner.data.database.plan.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.plan.LocalExpectedIncome
import java.util.*

@Dao
interface ExpectedIncomeDao {
    @Insert
    fun insert(expenditure: LocalExpectedIncome)

    @Update
    fun update(expenditure: LocalExpectedIncome)

    @Delete
    fun delete(expenditure: LocalExpectedIncome)

    @Query("select * from expected_income where date = :date")
    fun getExpectedIncomeAt(date: Date): List<LocalExpectedIncome>

    @Query("select * from expected_income where date between :from and :to")
    fun getExpectedIncomeBetween(from: Date, to: Date): List<LocalExpectedIncome>
}