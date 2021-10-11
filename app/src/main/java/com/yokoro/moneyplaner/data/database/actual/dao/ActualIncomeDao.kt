package com.yokoro.moneyplaner.data.database.actual.dao

import androidx.room.*
import com.yokoro.moneyplaner.data.database.actual.ActualIncome
import java.util.*

@Dao
interface ActualIncomeDao {
    @Insert
    fun insert(income: ActualIncome)

    @Update
    fun update(income: ActualIncome)

    @Delete
    fun delete(income: ActualIncome)

    @Query("select * from actual_income where date = :date")
    fun getActualIncomeAt(date: Date): List<ActualIncome>

    @Query("select * from actual_income where date between :from and :to")
    fun getActualIncomeBetween(from: Date, to: Date): List<ActualIncome>
}