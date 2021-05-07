package com.example.repositorydanlivedata.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class TvShowResponse(

    @SerializedName("id")
    var id: Int = 0,
    @SerializedName("name")
    var name: String = "",
    @SerializedName("overview")
    var overview: String = "",
    @SerializedName("poster_path")
    var poster: String = "",
    @SerializedName("backdrop_path")
    var backdrop: String = "",
    @SerializedName("vote_average")
    var rating: Double = 0.0,
    @SerializedName("first_air_date")
    var releaseDate: String,
    @SerializedName("genres")
    var genre: List<TvShowGenre>,
    @SerializedName("popularity")
    var popularity: Double = 0.0

)

data class TvShowGenre(
    @SerializedName("name")
    var name: String
)