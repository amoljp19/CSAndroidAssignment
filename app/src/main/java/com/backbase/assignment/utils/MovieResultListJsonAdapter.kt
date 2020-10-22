package com.backbase.assignment.utils

import com.backbase.assignment.model.MovieResult
import com.squareup.moshi.FromJson
import com.squareup.moshi.JsonClass
import com.squareup.moshi.JsonQualifier
import com.squareup.moshi.ToJson

@Retention(AnnotationRetention.RUNTIME)
@JsonQualifier
annotation class WrappedMovieResultList

@JsonClass(generateAdapter = true)
data class MovieResultList(val items: List<MovieResult>)

class MovieListJsonAdapter {
    @WrappedMovieResultList
    @FromJson
    fun fromJson(json: MovieResultList): List<MovieResult> {
        return json.items
    }

    @ToJson
    fun toJson(@WrappedMovieResultList value: List<MovieResult>): MovieResultList {
        throw UnsupportedOperationException()
    }
}