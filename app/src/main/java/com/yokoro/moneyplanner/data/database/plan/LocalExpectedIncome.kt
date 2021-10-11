package com.yokoro.moneyplanner.data.database.plan

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.util.*

@Entity(tableName = "expected_income")
data class LocalExpectedIncome (
    @PrimaryKey(autoGenerate = true) val id: Int,
    val date: LocalDate,
    val value: Int,
    val reason: String?
)