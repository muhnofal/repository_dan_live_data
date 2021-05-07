package com.example.repositorydanlivedata.data.source.remote.response

import com.google.gson.annotations.SerializedName

class TvShow {

    @SerializedName("results")
    private lateinit var tvshow: List<TvShowResponse>

    fun getTvShow(): List<TvShowResponse> {
        return tvshow
    }

}