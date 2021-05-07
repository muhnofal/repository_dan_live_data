package com.example.repositorydanlivedata.data

data class MovieDetailEntity(
    var movieId: Int,
    var movieName: String,
    var movieOverview: String,
    var movieRating: Double,
    var movieReleaseDate: String,
    var moviePopularity: Double,
    var movieBackDrop: String,
    var movieGenre: String
)