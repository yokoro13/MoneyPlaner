package com.yokoro.moneyplanner.domain.entity.plan

import com.yokoro.moneyplanner.domain.entity.shared.Date
import com.yokoro.moneyplanner.domain.entity.shared.Expenditure
import com.yokoro.moneyplanner.domain.entity.shared.Reason

data class ExpectedExpenditure(
    val date: Date,
    val reason: Reason,
    val value: Expenditure
)
