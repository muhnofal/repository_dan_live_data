package com.example.architecturecomponent.ui.detail

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.architecturecomponent.R
import com.example.architecturecomponent.data.TvShowEntity
import com.example.architecturecomponent.databinding.ActivityDetailTvShowBinding

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

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailFilmViewModel::class.java]

        val extra = intent.extras

        if (extra != null) {

            val tvShowId = extra.getString(EXTRA_ID)

            if (tvShowId != null) {
                viewModel.setSelectedTvShow(tvShowId)
                val tvShow = viewModel.getSelectedTvShow()
                populateTvShow(tvShow)
            }


        }

    }

    private fun populateTvShow(tvShow: TvShowEntity) {
        with(binding) {
            Glide.with(this@DetailTvShowActivity)
                .load(tvShow.tvImage)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .into(tvImage)
            val rating = tvShow.tvRating
            tvName.text = tvShow.tvName
            starRating(rating)
            tvRating.text = rating.toString()
            tvReleaseDate.text = tvShow.tvReleaseDate
            tvTime.text = tvShow.tvTime
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