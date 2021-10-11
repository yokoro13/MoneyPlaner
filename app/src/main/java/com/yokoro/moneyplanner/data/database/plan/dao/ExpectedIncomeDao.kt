package com.yokoro.moneyplanner.data.database.plan.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.plan.ExpectedIncome
import java.util.*

@Dao
interface ExpectedIncomeDao {
    @Insert
    fun insert(expenditure: ExpectedIncome)

    @Update
    fun update(expenditure: ExpectedIncome)

    @Delete
    fun delete(expenditure: ExpectedIncome)

    @Query("select * from expected_income where date = :date")
    fun getExpectedIncomeAt(date: Date): List<ExpectedIncome>

    @Query("select * from expected_income where date between :from and :to")
    fun getExpectedIncomeBetween(from: Date, to: Date): List<ExpectedIncome>
}