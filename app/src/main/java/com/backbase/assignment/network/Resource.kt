package com.backbase.assignment.network

sealed class Resource<out T> {
    data class Success<out T>(val data: T) : Resource<T>()
    data class Error<out T>(val error : String)
    data class Failure<out T>(val throwable: Throwable) : Resource<T>()
    class Loading<out T> : Resource<T>()
}

