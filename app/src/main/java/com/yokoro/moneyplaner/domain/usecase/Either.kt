package com.yokoro.moneyplaner.domain.usecase

sealed class Either<T> {
    data class Specify<T>(val value: T) : Either<T>()
    object Empty
}

object None