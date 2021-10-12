package com.yokoro.moneyplanner.data.database.plan.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.plan.LocalExpectedExpenditure
import java.time.LocalDate
import java.util.*

@Dao
interface ExpectedExpenditureDao {
    @Insert
    fun insert(expenditureLocal: LocalExpectedExpenditure)

    @Query("update expected_expenditure set date = :date and value = :value and reason = :reason where id = :id")
    fun update(id: Int, date: LocalDate, value: Int, reason: String)

    @Query("delete from expected_expenditure where id = :id")
    fun delete(id:Int)

    @Query("select * from expected_expenditure where date = :date")
    fun getExpectedExpenditureAt(date: Date): List<LocalExpectedExpenditure>

    @Query("select * from expected_expenditure where date between :from and :to")
    fun getExpectedExpenditureBetween(from: LocalDate, to: LocalDate): List<LocalExpectedExpenditure>
}