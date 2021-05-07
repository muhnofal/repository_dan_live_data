package com.example.repositorydanlivedata.di

import android.content.Context
import com.example.repositorydanlivedata.data.source.FilmRepository
import com.example.repositorydanlivedata.data.source.remote.RemoteDataSource

object Injection {

    fun provideRepository(context: Context): FilmRepository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return FilmRepository.getInstance(remoteDataSource)
    }

}