package com.backbase.assignment.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.backbase.assignment.model.MovieResult
import com.backbase.assignment.network.Resource
import com.backbase.assignment.repository.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {

    private val _popularMovies = MutableLiveData<List<MovieResult>>()
    val popularMovies: LiveData<List<MovieResult>>
        get() = _popularMovies

 init {
     fetchPopularMovies()
 }

    private fun fetchPopularMovies(){

        viewModelScope.launch {
                mainRepository.getPopularMovies("55957fcf3ba81b137f8fc01ac5a31fb5", "en-US", "1").let {
                    if (it.isSuccessful) {
                        _popularMovies.postValue(it.body()!!)
                    }
                }
        }

    }
}