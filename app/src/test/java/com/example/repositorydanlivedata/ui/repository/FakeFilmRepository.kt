package com.example.repositorydanlivedata.ui.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.repositorydanlivedata.data.MovieDetailEntity
import com.example.repositorydanlivedata.data.MovieEntity
import com.example.repositorydanlivedata.data.TvShowDetailEntity
import com.example.repositorydanlivedata.data.TvShowEntity
import com.example.repositorydanlivedata.data.source.FilmDataSource
import com.example.repositorydanlivedata.data.source.remote.RemoteDataSource
import com.example.repositorydanlivedata.data.source.remote.response.MovieResponse
import com.example.repositorydanlivedata.data.source.remote.response.TvShowResponse
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class FakeFilmRepository(private val remoteDataSource: RemoteDataSource) :
    FilmDataSource {

    override fun getPopularMovie(): LiveData<List<MovieEntity>> {
        val movieResult = MutableLiveData<List<MovieEntity>>()
        CoroutineScope(IO).launch {
            remoteDataSource.getPopularMovie(object : RemoteDataSource.LoadPopularMovieCallback {
                override fun onAllPopularMovieReceived(movieResponse: List<MovieResponse>) {
                    val movieList = ArrayList<MovieEntity>()

                    for (response in movieResponse) {

                        val movie = MovieEntity(
                            response.id,
                            response.poster,
                            response.name,
                            response.overview,
                            response.rating,
                            response.releaseDate,
                            response.popularity,
                            response.backdrop,
                        )
                        movieList.add(movie)
                    }
                    movieResult.postValue(movieList)
                }
            })
        }
        return movieResult
    }

    override fun getMovieDetail(movieId: Int): LiveData<MovieDetailEntity> {
        val movieResult = MutableLiveData<MovieDetailEntity>()
        CoroutineScope(IO).launch {
            remoteDataSource.getDetailMovie(
                movieId,
                object : RemoteDataSource.LoadDetailMovieCallback {
                    override fun onAllDetailMovieReceived(movieResponse: MovieResponse) {

                        val genre = movieResponse.genre
                        val listGenre: ArrayList<String> = ArrayList()
                        genre.forEach {
                            listGenre.add(it.name)
                        }
                        val movie = MovieDetailEntity(
                            movieResponse.id,
                            movieResponse.name,
                            movieResponse.overview,
                            movieResponse.rating,
                            movieResponse.releaseDate,
                            movieResponse.popularity,
                            movieResponse.backdrop,
                            listGenre.toString()
                        )
                        movieResult.postValue(movie)
                    }
                })
        }
        return movieResult
    }

    override fun getPopularTvShow(): LiveData<List<TvShowEntity>> {
        val tvShowResult = MutableLiveData<List<TvShowEntity>>()
        CoroutineScope(IO).launch {
            remoteDataSource.getPopularTvShow(object : RemoteDataSource.LoadPopularTvShowCallback {
                override fun onAllPopularTvShowReceived(tvShowResponse: List<TvShowResponse>) {
                    val tvList = ArrayList<TvShowEntity>()
                    for (response in tvShowResponse) {
                        val tvShow = TvShowEntity(
                            response.id,
                            response.poster,
                            response.name,
                            response.overview,
                            response.rating,
                            response.releaseDate,
                            response.popularity,
                            response.backdrop
                        )
                        tvList.add(tvShow)
                    }
                    tvShowResult.postValue(tvList)
                }
            })
        }
        return tvShowResult
    }

    override fun getTvShowDetail(tvShowId: Int): LiveData<TvShowDetailEntity> {
        val tvShowResult = MutableLiveData<TvShowDetailEntity>()
        CoroutineScope(IO).launch {
            remoteDataSource.getDetailTvShow(
                tvShowId,
                object : RemoteDataSource.LoadDetailTvShowCallback {
                    override fun onAllDetailTvShowReceived(tvShowResponse: TvShowResponse) {
                        val genre = tvShowResponse.genre
                        val listGenre = genre.map {
                            it.name
                        }
                        val tvShow = TvShowDetailEntity(
                            tvShowResponse.id,
                            tvShowResponse.name,
                            tvShowResponse.overview,
                            tvShowResponse.rating,
                            tvShowResponse.releaseDate,
                            tvShowResponse.popularity,
                            tvShowResponse.backdrop,
                            listGenre.toString()
                        )
                        tvShowResult.postValue(tvShow)
                    }
                })
        }
        return tvShowResult
    }


}