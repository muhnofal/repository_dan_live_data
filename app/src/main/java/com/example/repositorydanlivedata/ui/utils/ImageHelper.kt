package com.example.repositorydanlivedata.ui.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

object ImageHelper {

    const val ENDPOINT = "https://image.tmdb.org/t/p/"
    const val W185 = "w185"
    const val W500 = "w500"

    fun getImageFromApi(
        context: Context,
        loadingImage: Int,
        errorImage: Int,
        imageLink: String,
        imageView: ImageView
    ) {
        Glide.with(context).clear(imageView)
        Glide.with(context).load(imageLink)
            .apply(
                RequestOptions
                    .placeholderOf(loadingImage)
            )
            .error(errorImage)
            .into(imageView)
    }

}