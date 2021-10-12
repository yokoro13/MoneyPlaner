package com.yokoro.moneyplanner.domain.entity.plan

import com.yokoro.moneyplanner.domain.entity.shared.Date
import com.yokoro.moneyplanner.domain.entity.shared.Expenditure
import com.yokoro.moneyplanner.domain.entity.shared.Reason

data class ExpectedIncome(
    val id: Int, // FIXME domain層としてはもつべきでなさそう(data層のことを意識している)
    val date: Date,
    val reason: Reason,
    val value: Expenditure
)
