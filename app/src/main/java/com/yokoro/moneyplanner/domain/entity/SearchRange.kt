package com.yokoro.moneyplanner.domain.entity

import com.yokoro.moneyplanner.domain.usecase.Either

data class SearchRange(
    val from: Either<Date>,
    val to: Either<Date>
)
