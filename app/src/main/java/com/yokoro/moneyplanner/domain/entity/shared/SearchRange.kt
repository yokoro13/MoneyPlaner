package com.yokoro.moneyplanner.domain.entity.shared

import com.yokoro.moneyplanner.domain.usecase.Either

data class SearchRange(
    val from: Either<Date>,
    val to: Either<Date>
)
