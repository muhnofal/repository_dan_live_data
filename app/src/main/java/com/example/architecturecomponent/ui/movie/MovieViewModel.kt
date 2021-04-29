package com.example.architecturecomponent.ui.movie

import androidx.lifecycle.ViewModel
import com.example.architecturecomponent.data.MovieEntity
import com.example.architecturecomponent.ui.utils.DataDummy

class MovieViewModel : ViewModel() {

    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovie()

}