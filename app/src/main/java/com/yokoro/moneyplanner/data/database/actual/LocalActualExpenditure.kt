package com.yokoro.moneyplanner.data.database.actual

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.*

@Entity(tableName = "actual_expenditure")
data class LocalActualExpenditure (
    @PrimaryKey(autoGenerate = true) val id: Int,
    val date: LocalDate,
    val value: Int,
    val reason: String?
)