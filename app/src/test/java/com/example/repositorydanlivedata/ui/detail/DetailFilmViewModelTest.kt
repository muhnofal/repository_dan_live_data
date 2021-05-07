package com.example.repositorydanlivedata.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.repositorydanlivedata.data.MovieDetailEntity
import com.example.repositorydanlivedata.data.TvShowDetailEntity
import com.example.repositorydanlivedata.data.source.FilmRepository
import com.example.repositorydanlivedata.ui.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailFilmViewModelTest {

    private lateinit var viewModel: DetailFilmViewModel
    private val dummyMovie = DataDummy.generateDummyMovieDetail()[0]
    private val dummyTvShow = DataDummy.generateDummyTvShowDetail()[0]
    private val movieId = dummyMovie.movieId
    private val tvShowId = dummyTvShow.tvId

    @get:Rule
    var instantTaskExecutetorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var movieObserver: Observer<MovieDetailEntity>

    @Mock
    private lateinit var tvShowObserver: Observer<TvShowDetailEntity>

    @Before
    fun setUp() {
        viewModel = DetailFilmViewModel(filmRepository)
        viewModel.setSelectedMovie(movieId)
        viewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun getSelectedMovie() {
        val movie = MutableLiveData<MovieDetailEntity>()
        movie.value = dummyMovie

        `when`(filmRepository.getMovieDetail(movieId)).thenReturn(movie)
        val movieEntity = viewModel.getMovie().value as MovieDetailEntity
        verify(filmRepository).getMovieDetail(movieId)

        assertNotNull(movieEntity)
        assertEquals(dummyMovie.movieId, movieEntity.movieId)
        assertEquals(dummyMovie.movieBackDrop, movieEntity.movieBackDrop)
        assertEquals(dummyMovie.movieName, movieEntity.movieName)
        assertEquals(dummyMovie.movieRating, movieEntity.movieRating, 0.0)
        assertEquals(dummyMovie.movieReleaseDate, movieEntity.movieReleaseDate)
        assertEquals(dummyMovie.moviePopularity, movieEntity.moviePopularity, 0.0)
        assertEquals(dummyMovie.movieGenre, movieEntity.movieGenre)
        assertEquals(dummyMovie.movieOverview, movieEntity.movieOverview)

        viewModel.getMovie().observeForever(movieObserver)
        verify(movieObserver).onChanged(dummyMovie)
    }

    @Test
    fun getSelectedTvShow() {
        val tvShow = MutableLiveData<TvShowDetailEntity>()
        tvShow.value = dummyTvShow


        `when`(filmRepository.getTvShowDetail(tvShowId)).thenReturn(tvShow)
        val tvShowEntity = viewModel.getTvShow().value as TvShowDetailEntity
        verify(filmRepository).getTvShowDetail(tvShowId)
        assertNotNull(tvShowEntity)

        assertNotNull(tvShowEntity)
        assertEquals(dummyTvShow.tvId, tvShowEntity.tvId)
        assertEquals(dummyTvShow.tvBackDrop, tvShowEntity.tvBackDrop)
        assertEquals(dummyTvShow.tvName, tvShowEntity.tvName)
        assertEquals(dummyTvShow.tvRating, tvShowEntity.tvRating, 0.0)
        assertEquals(dummyTvShow.tvReleaseDate, tvShowEntity.tvReleaseDate)
        assertEquals(dummyTvShow.tvPopularity, tvShowEntity.tvPopularity, 0.0)
        assertEquals(dummyTvShow.tvGenre, tvShowEntity.tvGenre)
        assertEquals(dummyTvShow.tvOverview, tvShowEntity.tvOverview)

        viewModel.getTvShow().observeForever(tvShowObserver)
        verify(tvShowObserver).onChanged(dummyTvShow)
    }
}