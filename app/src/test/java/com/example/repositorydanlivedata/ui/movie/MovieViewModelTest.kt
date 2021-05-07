package com.example.repositorydanlivedata.ui.movie

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.example.repositorydanlivedata.data.MovieEntity
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
class MovieViewModelTest {

    private lateinit var viewModel: MovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var filmRepository: FilmRepository

    @Mock
    private lateinit var observer: Observer<List<MovieEntity>>

    @Before
    fun setUp() {
        viewModel = MovieViewModel(filmRepository)
    }

    @Test
    fun getMovies() {
        val dummyCourse = DataDummy.generateDummyMovie()
        val movies = MutableLiveData<List<MovieEntity>>()
        movies.value = dummyCourse

        `when`(filmRepository.getPopularMovie()).thenReturn(movies)
        val movieEntities = viewModel.getMovies().value
        verify(filmRepository).getPopularMovie()
        assertNotNull(movieEntities)
        assertEquals(10, movieEntities?.size)

        viewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyCourse)
    }
}