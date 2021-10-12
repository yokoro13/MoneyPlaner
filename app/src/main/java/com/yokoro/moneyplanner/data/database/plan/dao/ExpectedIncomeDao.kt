package com.yokoro.moneyplanner.data.database.plan.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.plan.LocalExpectedIncome
import java.time.LocalDate
import java.util.*

@Dao
interface ExpectedIncomeDao {
    @Insert
    fun insert(expenditure: LocalExpectedIncome)

    @Query("update expected_income set date = :date and value = :value and reason = :reason where id = :id")
    fun update(id: Int, date: LocalDate, value: Int, reason: String)

    @Query("delete from expected_income where id = :id")
    fun delete(id:Int)

    @Query("select * from expected_income where date = :date")
    fun getExpectedIncomeAt(date: LocalDate): List<LocalExpectedIncome>

    @Query("select * from expected_income where date between :from and :to")
    fun getExpectedIncomeBetween(from: LocalDate, to: LocalDate): List<LocalExpectedIncome>
}