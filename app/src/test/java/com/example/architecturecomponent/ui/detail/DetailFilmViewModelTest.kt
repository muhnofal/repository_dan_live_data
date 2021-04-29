package com.example.architecturecomponent.ui.detail

import com.example.architecturecomponent.ui.utils.DataDummy
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class DetailFilmViewModelTest {

    private lateinit var viewModel: DetailFilmViewModel
    private val dummyMovie = DataDummy.generateDummyMovie()[0]
    private val dummyTvShow = DataDummy.generateDummyTvShow()[0]

    @Before
    fun setUp() {
        viewModel = DetailFilmViewModel()
    }

    @Test
    fun getSelectedMovie() {
        viewModel.setSelectedMovie(dummyMovie.movieId)
        val movieEntity = viewModel.getSelectedMovie()
        assertNotNull(movieEntity)
        assertEquals(dummyMovie.movieId, movieEntity.movieId)
        assertEquals(dummyMovie.movieImage, movieEntity.movieImage)
        assertEquals(dummyMovie.movieName, movieEntity.movieName)
        assertEquals(dummyMovie.movieRating, movieEntity.movieRating, 0.0)
        assertEquals(dummyMovie.movieReleaseDate, movieEntity.movieReleaseDate)
        assertEquals(dummyMovie.movieGenre, movieEntity.movieGenre)
        assertEquals(dummyMovie.movieTime, movieEntity.movieTime)
        assertEquals(dummyMovie.movieOverview, movieEntity.movieOverview)
    }

    @Test
    fun getSelectedTvShow() {
        viewModel.setSelectedTvShow(dummyTvShow.tvId)
        val tvShowEntity = viewModel.getSelectedTvShow()
        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.tvId, tvShowEntity.tvId)
        assertEquals(dummyTvShow.tvImage, tvShowEntity.tvImage)
        assertEquals(dummyTvShow.tvName, tvShowEntity.tvName)
        assertEquals(dummyTvShow.tvRating, tvShowEntity.tvRating, 0.0)
        assertEquals(dummyTvShow.tvReleaseDate, tvShowEntity.tvReleaseDate)
        assertEquals(dummyTvShow.tvGenre, tvShowEntity.tvGenre)
        assertEquals(dummyTvShow.tvTime, tvShowEntity.tvTime)
        assertEquals(dummyTvShow.tvOverview, tvShowEntity.tvOverview)
    }
}