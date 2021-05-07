package com.example.repositorydanlivedata.ui.movie

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.repositorydanlivedata.data.MovieEntity
import com.example.repositorydanlivedata.data.source.FilmRepository

class MovieViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getMovies(): LiveData<List<MovieEntity>> = filmRepository.getPopularMovie()

}