package com.example.repositorydanlivedata.data

data class MovieEntity(
    var movieId: Int,
    var movieImage: String,
    var movieName: String,
    var movieOverview: String,
    var movieRating: Double,
    var movieReleaseDate: String,
    var moviePopularity: Double,
    var movieBackDrop: String,
)