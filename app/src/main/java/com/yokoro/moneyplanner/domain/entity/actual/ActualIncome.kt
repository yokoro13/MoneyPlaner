package com.yokoro.moneyplanner.domain.entity.actual

import com.yokoro.moneyplanner.domain.entity.shared.Date
import com.yokoro.moneyplanner.domain.entity.shared.Expenditure
import com.yokoro.moneyplanner.domain.entity.shared.Reason

data class ActualIncome (
    val date: Date,
    val reason: Reason,
    val value: Expenditure
)