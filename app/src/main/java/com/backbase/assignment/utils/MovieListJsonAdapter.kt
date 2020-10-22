package com.backbase.assignment.utils

import com.backbase.assignment.model.MovieResult
import com.backbase.assignment.model.MoviesResponse
import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonClass
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class WrappedMovieResultList

class MovieListJsonAdapter {
    @WrappedMovieResultList
    @FromJson
    fun fromJson(json: MoviesResponse): List<MovieResult> {
        return json.results
    }

    @ToJson
    fun toJson(@WrappedMovieResultList value: List<MovieResult>): MoviesResponse {
        throw UnsupportedOperationException()
    }
}