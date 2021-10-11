package com.yokoro.moneyplanner.data.database.actual.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.actual.LocalActualExpenditure
import java.time.LocalDate
import java.util.*

@Dao
interface ActualExpenditureDao {
    @Insert
    fun insert(expenditureLocal: LocalActualExpenditure)

    @Update
    fun update(expenditureLocal: LocalActualExpenditure)

    @Delete
    fun delete(expenditureLocal: LocalActualExpenditure)

    @Query("select * from actual_expenditure where date = :date")
    fun getActualExpenditureAt(date: LocalDate): List<LocalActualExpenditure>

    @Query("select * from actual_expenditure where date between :from and :to")
    fun getActualExpenditureBetween(from: LocalDate, to: LocalDate): List<LocalActualExpenditure>
}