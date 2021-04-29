package com.example.architecturecomponent.ui.tvshow

import androidx.lifecycle.ViewModel
import com.example.architecturecomponent.data.TvShowEntity
import com.example.architecturecomponent.ui.utils.DataDummy

class TvShowViewModel : ViewModel() {

    fun getTvShow(): List<TvShowEntity> = DataDummy.generateDummyTvShow()

}