package com.example.repositorydanlivedata.data

data class TvShowDetailEntity(
    var tvId: Int,
    var tvName: String,
    var tvOverview: String,
    var tvRating: Double,
    var tvReleaseDate: String,
    var tvPopularity: Double,
    var tvBackDrop: String,
    var tvGenre: String
)