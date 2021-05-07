package com.example.repositorydanlivedata.data.source.remote.response

import com.google.gson.annotations.SerializedName

class Movie {

    @SerializedName("results")
    private lateinit var movies: List<MovieResponse>

    fun getMovies(): List<MovieResponse> {
        return movies
    }


}