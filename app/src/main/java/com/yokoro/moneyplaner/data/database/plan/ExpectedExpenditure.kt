package com.yokoro.moneyplaner.data.database.plan

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "expected_expenditure")
data class ExpectedExpenditure (
    @PrimaryKey(autoGenerate = true) val id: Int,
    val date: Date,
    val value: Int,
    val reason: String?
)
