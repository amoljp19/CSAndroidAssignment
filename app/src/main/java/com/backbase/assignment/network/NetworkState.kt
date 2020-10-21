package com.backbase.assignment.network

import com.backbase.assignment.model.MovieResult

sealed class NetworkState {
    data class Success(val data : List<MovieResult>) : NetworkState()
    data class Error(val error : String) : NetworkState()
    data class NetworkException(val error : String) : NetworkState()
    object Loading : NetworkState()
    object InvalidData : NetworkState()
}