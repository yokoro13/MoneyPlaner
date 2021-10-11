package com.yokoro.moneyplanner.domain.usecase

sealed class Either<T> {
    data class Specify<T>(val value: T) : Either<T>()
    object Empty
}

object None