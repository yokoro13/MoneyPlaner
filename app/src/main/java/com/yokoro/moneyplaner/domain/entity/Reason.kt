package com.yokoro.moneyplaner.domain.entity

import com.yokoro.moneyplaner.domain.usecase.Either

data class Reason(
    val value: Either<String>
)
