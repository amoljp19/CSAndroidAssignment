package com.backbase.assignment.repository

import com.backbase.assignment.network.ApiHelper
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {

    suspend fun getPlayingMovies(language: String,
                                 page: String,
                                 api_Key: String
    ) = apiHelper.getplayingMovies(language, page, api_Key)

    suspend fun getPopularMovies(
        api_Key: String,
        language: String,
        page: String
    ) = apiHelper.getPopularMovies(api_Key, language, page)

}