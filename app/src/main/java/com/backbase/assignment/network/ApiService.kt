package com.backbase.assignment.network

import MovieResult
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/3/movie/now_playing")
    suspend fun getplayingMovies(
        @Query("language") language: String,
        @Query("page") hash: String,
        @Query("api_key") api_Key: String
    ): Response<List<MovieResult>>

    @GET("/3/movie/now_playing")
    suspend fun getPopularMovies(
        @Query("api_key") api_Key: String,
        @Query("language") language: String,
        @Query("page") hash: String
    ): Response<List<MovieResult>>
}