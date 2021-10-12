package com.yokoro.moneyplanner.data.database.actual.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.actual.LocalActualIncome
import java.time.LocalDate
import java.util.*

@Dao
interface ActualIncomeDao {
    @Insert
    fun insert(incomeLocal: LocalActualIncome)

    @Query("update actual_income set date = :date and value = :value and reason = :reason where id = :id")
    fun update(id: Int, date: LocalDate, value: Int, reason: String)

    @Query("delete from actual_income where id = :id")
    fun delete(id:Int)

    @Query("select * from actual_income where date = :date")
    fun getActualIncomeAt(date: LocalDate): List<LocalActualIncome>

    @Query("select * from actual_income where date between :from and :to")
    fun getActualIncomeBetween(from: LocalDate, to: LocalDate): List<LocalActualIncome>
}