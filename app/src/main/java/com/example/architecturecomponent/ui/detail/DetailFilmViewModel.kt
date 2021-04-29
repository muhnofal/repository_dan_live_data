package com.example.architecturecomponent.ui.detail

import androidx.lifecycle.ViewModel
import com.example.architecturecomponent.data.MovieEntity
import com.example.architecturecomponent.data.TvShowEntity
import com.example.architecturecomponent.ui.utils.DataDummy

class DetailFilmViewModel : ViewModel() {

    private var movieId: String? = null
    private var tvShowId: String? = null

    fun setSelectedMovie(movieId: String) {
        this.movieId = movieId
    }

    fun setSelectedTvShow(tvShowId: String) {
        this.tvShowId = tvShowId
    }

    private fun getMovie(): List<MovieEntity> = DataDummy.generateDummyMovie()
    private fun getTvShow(): List<TvShowEntity> = DataDummy.generateDummyTvShow()

    fun getSelectedMovie(): MovieEntity {
        lateinit var movie: MovieEntity
        val movieEntities = getMovie()
        for (movieEntity in movieEntities) {
            if (movieEntity.movieId == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }

    fun getSelectedTvShow(): TvShowEntity {
        lateinit var tvShow: TvShowEntity
        val tvShowEntities = getTvShow()
        for (tvShowEntity in tvShowEntities) {
            if (tvShowEntity.tvId == tvShowId) {
                tvShow = tvShowEntity
            }
        }
        return tvShow
    }

}