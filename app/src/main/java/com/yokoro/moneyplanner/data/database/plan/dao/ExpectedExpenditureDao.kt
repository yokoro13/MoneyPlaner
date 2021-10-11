package com.yokoro.moneyplanner.data.database.plan.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.plan.LocalExpectedExpenditure
import java.time.LocalDate
import java.util.*

@Dao
interface ExpectedExpenditureDao {
    @Insert
    fun insert(expenditureLocal: LocalExpectedExpenditure)

    @Update
    fun update(expenditureLocal: LocalExpectedExpenditure)

    @Delete
    fun delete(expenditureLocal: LocalExpectedExpenditure)

    @Query("select * from expected_expenditure where date = :date")
    fun getExpectedExpenditureAt(date: Date): List<LocalExpectedExpenditure>

    @Query("select * from expected_expenditure where date between :from and :to")
    fun getExpectedExpenditureBetween(from: LocalDate, to: LocalDate): List<LocalExpectedExpenditure>
}