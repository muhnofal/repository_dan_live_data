package com.example.architecturecomponent.data

data class MovieEntity(
    var movieId: String,
    var movieImage: Int,
    var movieName: String,
    var movieOverview: String,
    var movieRating: Double,
    var movieReleaseDate: String,
    var movieTime: String,
    var movieGenre: String
)