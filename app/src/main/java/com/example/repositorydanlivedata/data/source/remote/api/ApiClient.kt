package com.example.repositorydanlivedata.data.source.remote.api

import com.example.repositorydanlivedata.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    private const val BASE_URL = BuildConfig.BASE_URL
    private var retrofit: Retrofit? = null

    private fun getData(): Retrofit? {
        retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }

    val retrofitService: ApiService? by lazy {
        getData()?.create(ApiService::class.java)
    }

}