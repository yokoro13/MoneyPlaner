package com.yokoro.moneyplanner.domain.entity.shared

import com.yokoro.moneyplanner.domain.usecase.Either

data class Reason(
    val value: Either<String>
)
