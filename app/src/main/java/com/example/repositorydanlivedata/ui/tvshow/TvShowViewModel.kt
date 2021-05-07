package com.example.repositorydanlivedata.ui.tvshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.repositorydanlivedata.data.TvShowEntity
import com.example.repositorydanlivedata.data.source.FilmRepository

class TvShowViewModel(private val filmRepository: FilmRepository) : ViewModel() {

    fun getTvShow(): LiveData<List<TvShowEntity>> = filmRepository.getPopularTvShow()

}