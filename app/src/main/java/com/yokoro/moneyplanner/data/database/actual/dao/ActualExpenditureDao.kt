package com.yokoro.moneyplanner.data.database.actual.dao

import androidx.room.*
import com.yokoro.moneyplanner.data.database.actual.LocalActualExpenditure
import java.time.LocalDate
import java.util.*

@Dao
interface ActualExpenditureDao {
    @Insert
    fun insert(expenditureLocal: LocalActualExpenditure)

    @Query("update actual_expenditure set date = :date and value = :value and reason = :reason where id = :id")
    fun update(id: Int, date: LocalDate, value: Int, reason: String)

    @Query("delete from actual_expenditure where id = :id")
    fun delete(id:Int)

    @Query("select * from actual_expenditure where date = :date")
    fun getActualExpenditureAt(date: LocalDate): List<LocalActualExpenditure>

    @Query("select * from actual_expenditure where date between :from and :to")
    fun getActualExpenditureBetween(from: LocalDate, to: LocalDate): List<LocalActualExpenditure>
}