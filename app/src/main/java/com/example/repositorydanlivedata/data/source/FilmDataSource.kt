package com.example.repositorydanlivedata.data.source

import androidx.lifecycle.LiveData
import com.example.repositorydanlivedata.data.MovieDetailEntity
import com.example.repositorydanlivedata.data.MovieEntity
import com.example.repositorydanlivedata.data.TvShowDetailEntity
import com.example.repositorydanlivedata.data.TvShowEntity

interface FilmDataSource {

    fun getPopularMovie(): LiveData<List<MovieEntity>>
    fun getMovieDetail(movieId: Int): LiveData<MovieDetailEntity>
    fun getPopularTvShow(): LiveData<List<TvShowEntity>>
    fun getTvShowDetail(tvShowId: Int): LiveData<TvShowDetailEntity>

}