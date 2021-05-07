package com.example.repositorydanlivedata.data.source.remote

import com.example.repositorydanlivedata.data.source.remote.api.ApiClient
import com.example.repositorydanlivedata.data.source.remote.response.MovieResponse
import com.example.repositorydanlivedata.data.source.remote.response.TvShowResponse
import com.example.repositorydanlivedata.ui.utils.EspressoIdlingResource
import retrofit2.await


class RemoteDataSource {

    companion object {
        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(): RemoteDataSource = instance ?: synchronized(this) {
            instance ?: RemoteDataSource().apply { instance = this }
        }
    }


    suspend fun getPopularMovie(callback: LoadPopularMovieCallback) {
        EspressoIdlingResource.increment()

        ApiClient.retrofitService?.getPopularMovie()?.await()?.getMovies().let { movie ->
            if (movie != null) {
                callback.onAllPopularMovieReceived(movie)
                EspressoIdlingResource.decrement()
            }
        }
    }

    suspend fun getDetailMovie(movieId: Int, callback: LoadDetailMovieCallback) {
        EspressoIdlingResource.increment()
        ApiClient.retrofitService?.getDetailMovie(movieId)?.await()?.let { movieResponse ->
            callback.onAllDetailMovieReceived(movieResponse)
            EspressoIdlingResource.decrement()
        }
    }

    suspend fun getPopularTvShow(callback: LoadPopularTvShowCallback) {
        EspressoIdlingResource.increment()
        ApiClient.retrofitService?.getPopularTv()?.await()?.getTvShow().let { tvshow ->
            if (tvshow != null) {
                callback.onAllPopularTvShowReceived(tvshow)
                EspressoIdlingResource.decrement()
            }
        }
    }

    suspend fun getDetailTvShow(tvShowId: Int, callback: LoadDetailTvShowCallback) {
        EspressoIdlingResource.increment()
        ApiClient.retrofitService?.getDetailTvShow(tvShowId)?.await()?.let { tvShowResponse ->
            callback.onAllDetailTvShowReceived(tvShowResponse)
            EspressoIdlingResource.decrement()
        }
    }

    interface LoadPopularMovieCallback {
        fun onAllPopularMovieReceived(movieResponse: List<MovieResponse>)
    }

    interface LoadDetailMovieCallback {
        fun onAllDetailMovieReceived(movieResponse: MovieResponse)
    }

    interface LoadPopularTvShowCallback {
        fun onAllPopularTvShowReceived(tvShowResponse: List<TvShowResponse>)
    }

    interface LoadDetailTvShowCallback {
        fun onAllDetailTvShowReceived(tvShowResponse: TvShowResponse)
    }

}