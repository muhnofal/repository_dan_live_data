package com.example.repositorydanlivedata.ui.repository

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.repositorydanlivedata.data.source.remote.RemoteDataSource
import com.example.repositorydanlivedata.ui.utils.DataDummy
import com.example.repositorydanlivedata.ui.utils.LiveDataTestUtil
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito

class FilmRepositoryTest {

    @get:Rule
    var instantTaskExecuteRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val filmRepository = FakeFilmRepository(remote)

    private val listMovieResponse = DataDummy.generateRemoteDummyMovies()
    private val movieResponse = DataDummy.generateRemoteDummyMovies()[0]
    private val movieId = listMovieResponse[0].id
    private val listTvResponse = DataDummy.generateRemoteDummyTvShows()
    private val tvResponse = DataDummy.generateRemoteDummyTvShows()[0]
    private val tvShowId = listTvResponse[0].id

    @Test
    fun getPopularMovie() {
        runBlocking {
            doAnswer { invocation ->
                (invocation.arguments[0] as RemoteDataSource.LoadPopularMovieCallback)
                    .onAllPopularMovieReceived(listMovieResponse)
                null
            }.`when`(remote).getPopularMovie(any())
            val movieEntities = LiveDataTestUtil.getValue(filmRepository.getPopularMovie())
            verify(remote).getPopularMovie(any())
            assertNotNull(movieEntities)
            assertEquals(listMovieResponse.size.toLong(), movieEntities.size.toLong())
        }
    }

    @Test
    fun getMovieDetail() {
        runBlocking {
            doAnswer { invocation ->
                (invocation.arguments[1] as RemoteDataSource.LoadDetailMovieCallback)
                    .onAllDetailMovieReceived(movieResponse)
                null
            }.`when`(remote).getDetailMovie(eq(movieId), any())

            val movieEntities = LiveDataTestUtil.getValue(filmRepository.getMovieDetail(movieId))

            verify(remote).getDetailMovie(eq(movieId), any())

            assertNotNull(movieEntities)
            assertEquals(movieResponse.id, movieEntities.movieId)
        }
    }

    @Test
    fun getPopularTvShow() {
        runBlocking {
            doAnswer { invocation ->
                (invocation.arguments[0] as RemoteDataSource.LoadPopularTvShowCallback)
                    .onAllPopularTvShowReceived(listTvResponse)
                null
            }.`when`(remote).getPopularTvShow(any())
            val tvShowEntities = LiveDataTestUtil.getValue(filmRepository.getPopularTvShow())
            verify(remote).getPopularTvShow(any())
            assertNotNull(tvShowEntities)
            assertEquals(listTvResponse.size.toLong(), tvShowEntities.size.toLong())
        }
    }

    @Test
    fun getTvShowDetail() {
        runBlocking {
            doAnswer { invocation ->
                (invocation.arguments[1] as RemoteDataSource.LoadDetailTvShowCallback)
                    .onAllDetailTvShowReceived(tvResponse)
                null
            }.`when`(remote).getDetailTvShow(eq(tvShowId), any())

            val tvShowEntity = LiveDataTestUtil.getValue(filmRepository.getTvShowDetail(tvShowId))

            verify(remote).getDetailTvShow(eq(tvShowId), any())

            assertNotNull(tvShowEntity)
            assertEquals(tvResponse.id, tvShowEntity.tvId)
        }
    }


}