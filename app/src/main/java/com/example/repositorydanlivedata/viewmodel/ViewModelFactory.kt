package com.example.repositorydanlivedata.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.repositorydanlivedata.data.source.FilmRepository
import com.example.repositorydanlivedata.di.Injection
import com.example.repositorydanlivedata.ui.detail.DetailFilmViewModel
import com.example.repositorydanlivedata.ui.movie.MovieViewModel
import com.example.repositorydanlivedata.ui.tvshow.TvShowViewModel

class ViewModelFactory private constructor(private val mAcademyRepository: FilmRepository) :
    ViewModelProvider.NewInstanceFactory() {

    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context)).apply {
                    instance = this
                }
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        when {
            modelClass.isAssignableFrom(MovieViewModel::class.java) -> {
                return MovieViewModel(mAcademyRepository) as T
            }
            modelClass.isAssignableFrom(DetailFilmViewModel::class.java) -> {
                return DetailFilmViewModel(mAcademyRepository) as T
            }
            modelClass.isAssignableFrom(TvShowViewModel::class.java) -> {
                return TvShowViewModel(mAcademyRepository) as T
            }

            else -> ("Unknown ViewModel class: " + modelClass.name)
        }

        return super.create(modelClass)
    }
}