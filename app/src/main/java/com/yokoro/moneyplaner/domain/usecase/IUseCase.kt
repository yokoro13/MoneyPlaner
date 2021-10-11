package com.yokoro.moneyplaner.domain.usecase

interface IUseCase<T, R> where T: Any{
    fun execute(value: T): Either<R>
}