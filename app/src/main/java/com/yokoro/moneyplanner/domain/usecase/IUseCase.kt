package com.yokoro.moneyplanner.domain.usecase

interface IUseCase<T, R> where T: Any{
    fun execute(value: T): Either<R>
}