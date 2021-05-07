package com.example.repositorydanlivedata.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.repositorydanlivedata.data.MovieDetailEntity
import com.example.repositorydanlivedata.data.TvShowDetailEntity
import com.example.repositorydanlivedata.data.source.FilmRepository

class DetailFilmViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    private var movieId: Int = 0
    private var tvShowId: Int = 0

    fun setSelectedMovie(movieId: Int) {
        this.movieId = movieId
    }

    fun setSelectedTvShow(tvShowId: Int) {
        this.tvShowId = tvShowId
    }

    fun getMovie(): LiveData<MovieDetailEntity> = filmRepository.getMovieDetail(movieId)
    fun getTvShow(): LiveData<TvShowDetailEntity> = filmRepository.getTvShowDetail(tvShowId)

}