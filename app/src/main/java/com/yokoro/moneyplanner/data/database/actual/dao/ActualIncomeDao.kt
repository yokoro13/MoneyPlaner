package com.yokoro.moneyplanner.data.database.actual.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.actual.LocalActualIncome
import java.time.LocalDate
import java.util.*

@Dao
interface ActualIncomeDao {
    @Insert
    fun insert(incomeLocal: LocalActualIncome)

    @Update
    fun update(incomeLocal: LocalActualIncome)

    @Delete
    fun delete(incomeLocal: LocalActualIncome)

    @Query("select * from actual_income where date = :date")
    fun getActualIncomeAt(date: LocalDate): List<LocalActualIncome>

    @Query("select * from actual_income where date between :from and :to")
    fun getActualIncomeBetween(from: LocalDate, to: LocalDate): List<LocalActualIncome>
}