package com.yokoro.moneyplanner.domain.entity

import com.yokoro.moneyplanner.domain.usecase.Either

data class Reason(
    val value: Either<String>
)
