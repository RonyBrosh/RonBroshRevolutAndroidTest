package com.ronybrosh.revolutandroidtest.domain.model

sealed class Resource<T> {
    class Loading<T> : Resource<T>()

    class Success<T>(val data: T) : Resource<T>()

    class Error<T>(val throwable: Throwable) : Resource<T>()
}