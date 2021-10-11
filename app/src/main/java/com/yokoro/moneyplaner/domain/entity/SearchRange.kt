package com.yokoro.moneyplaner.domain.entity

import com.yokoro.moneyplaner.domain.usecase.Either

data class SearchRange(
    val from: Either<Date>,
    val to: Either<Date>
)
