package com.backbase.assignment.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.backbase.assignment.model.MovieResult
import com.backbase.assignment.repository.MainRepository
import kotlinx.coroutines.launch
import javax.annotation.Resource

class MainViewModel @ViewModelInject constructor(
    private val mainRepository: MainRepository
) : ViewModel() {



 init {

 }

    private fun fetchPopularMovies(){

    }
}