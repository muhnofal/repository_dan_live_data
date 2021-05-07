package com.example.repositorydanlivedata.ui.detail

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.repositorydanlivedata.R
import com.example.repositorydanlivedata.data.TvShowDetailEntity
import com.example.repositorydanlivedata.databinding.ActivityDetailTvShowBinding
import com.example.repositorydanlivedata.ui.utils.ImageHelper.ENDPOINT
import com.example.repositorydanlivedata.ui.utils.ImageHelper.W500
import com.example.repositorydanlivedata.ui.utils.ImageHelper.getImageFromApi
import com.example.repositorydanlivedata.viewmodel.ViewModelFactory

class DetailTvShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailTvShowBinding

    companion object {
        const val EXTRA_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailTvShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailFilmViewModel::class.java]

        val extra = intent.extras

        if (extra != null) {

            val tvShowId = extra.getInt(EXTRA_ID)

            viewModel.setSelectedTvShow(tvShowId)
            viewModel.getTvShow().observe(this, { tvShow -> populateTvShow(tvShow) })

        }

    }

    private fun populateTvShow(tvShow: TvShowDetailEntity) {
        val popularity: String
        val link = tvShow.tvBackDrop.let { tvShowimg -> ENDPOINT + W500 + tvShowimg }
        with(binding) {

            getImageFromApi(
                context = this@DetailTvShowActivity,
                loadingImage = R.drawable.ic_loading,
                errorImage = R.drawable.ic_error,
                imageLink = link,
                imageView = tvImage
            )

            val rating = tvShow.tvRating
            tvName.text = tvShow.tvName
            starRating(rating)
            tvRating.text = rating.toString()
            tvReleaseDate.text = tvShow.tvReleaseDate
            popularity = tvShow.tvPopularity.toString()
            tvPopular.text = popularity
            tvGenre.text = tvShow.tvGenre
            tvOverview.text = tvShow.tvOverview
            shareTv.setOnClickListener {
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, "Share Movie: ${tvShow.tvName}")
                intent.type = "text/plain"
                startActivity(Intent.createChooser(intent, "Share To"))
            }

        }
    }

    private fun starRating(movieRating: Double) {
        when (movieRating) {
            in 5.0..6.0 -> {
                getOneStar()
            }
            in 6.1..7.0 -> {
                getTwoStar()
            }
            in 7.1..8.0 -> {
                getThreeStar()
            }
            in 8.1..9.0 -> {
                getFourStar()
            }
            in 9.0..10.0 -> {
                getFiveStar()
            }
        }

    }

    private fun getFiveStar() {
        binding.star1.visibility = View.VISIBLE
        binding.star2.visibility = View.VISIBLE
        binding.star3.visibility = View.VISIBLE
        binding.star4.visibility = View.VISIBLE
        binding.star5.visibility = View.VISIBLE
    }

    private fun getFourStar() {
        binding.star1.visibility = View.VISIBLE
        binding.star2.visibility = View.VISIBLE
        binding.star3.visibility = View.VISIBLE
        binding.star4.visibility = View.VISIBLE
    }

    private fun getThreeStar() {
        binding.star1.visibility = View.VISIBLE
        binding.star2.visibility = View.VISIBLE
        binding.star3.visibility = View.VISIBLE
    }

    private fun getTwoStar() {
        binding.star1.visibility = View.VISIBLE
        binding.star2.visibility = View.VISIBLE
    }

    private fun getOneStar() {
        binding.star1.visibility = View.VISIBLE
    }

}