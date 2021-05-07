package com.example.repositorydanlivedata.data.source.remote.api


import com.example.repositorydanlivedata.BuildConfig
import com.example.repositorydanlivedata.data.source.remote.response.Movie
import com.example.repositorydanlivedata.data.source.remote.response.MovieResponse
import com.example.repositorydanlivedata.data.source.remote.response.TvShow
import com.example.repositorydanlivedata.data.source.remote.response.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    fun getPopularMovie(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ): Call<Movie>

    @GET("movie/{movie_id}")
    fun getDetailMovie(
        @Path("movie_id") id: Int,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ): Call<MovieResponse>

    @GET("tv/popular")
    fun getPopularTv(
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ): Call<TvShow>

    @GET("tv/{tv_id}")
    fun getDetailTvShow(
        @Path("tv_id") id: Int,
        @Query("api_key") apiKey: String = BuildConfig.TMDB_API_KEY
    ): Call<TvShowResponse>


}