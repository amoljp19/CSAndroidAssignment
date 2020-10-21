package com.backbase.assignment.network

import com.backbase.assignment.model.MovieResult

sealed class NetworkStatus {
    data class Success(val data : List<MovieResult>) : NetworkStatus()
    data class Error(val error : String) : NetworkStatus()
    data class NetworkException(val error : String) : NetworkStatus()
    object Loading : NetworkStatus()
    object InvalidData : NetworkStatus()
}