package com.yokoro.moneyplaner.data.database.plan.dao

import androidx.room.*
import com.yokoro.moneyplaner.data.database.plan.ExpectedExpenditure
import java.util.*

@Dao
interface ExpectedExpenditureDao {
    @Insert
    fun insert(expenditure: ExpectedExpenditure)

    @Update
    fun update(expenditure: ExpectedExpenditure)

    @Delete
    fun delete(expenditure: ExpectedExpenditure)

    @Query("select * from expected_expenditure where date = :date")
    fun getExpectedExpenditureAt(date: Date): List<ExpectedExpenditure>

    @Query("select * from expected_expenditure where date between :from and :to")
    fun getExpectedExpenditureBetween(from: Date, to: Date): List<ExpectedExpenditure>
}