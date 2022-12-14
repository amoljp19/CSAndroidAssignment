package com.backbase.assignment.network

import com.backbase.assignment.model.MovieResult
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService) : ApiHelper {



    override suspend fun getplayingMovies(language: String,
                                          page: String,
                                          api_Key: String
    ): Response<List<MovieResult>> = apiService.getplayingMovies(language, page, api_Key)

    override suspend fun getPopularMovies(
        api_Key: String,
        language: String,
        page: String
    ): Response<List<MovieResult>> = apiService.getPopularMovies(api_Key, language, page)

}