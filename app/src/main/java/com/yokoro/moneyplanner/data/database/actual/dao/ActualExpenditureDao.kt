package com.yokoro.moneyplanner.data.database.actual.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.actual.ActualExpenditure
import java.util.*

@Dao
interface ActualExpenditureDao {
    @Insert
    fun insert(expenditure: ActualExpenditure)

    @Update
    fun update(expenditure: ActualExpenditure)

    @Delete
    fun delete(expenditure: ActualExpenditure)

    @Query("select * from actual_expenditure where date = :date")
    fun getActualExpenditureAt(date: Date): List<ActualExpenditure>

    @Query("select * from actual_expenditure where date between :from and :to")
    fun getActualExpenditureBetween(from: Date, to: Date): List<ActualExpenditure>
}