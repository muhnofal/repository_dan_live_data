package com.example.architecturecomponent.ui.detail

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.architecturecomponent.R
import com.example.architecturecomponent.data.MovieEntity
import com.example.architecturecomponent.databinding.ActivityDetailMovieBinding

class DetailMovieActivity : AppCompatActivity() {

    private var movieId: String? = null
    private lateinit var binding: ActivityDetailMovieBinding


    companion object {
        const val EXTRA_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailFilmViewModel::class.java]

        val extras = intent.extras

        if (extras != null) {

            movieId = extras.getString(EXTRA_ID)

            if (movieId != null) {
                viewModel.setSelectedMovie(movieId!!)
                val movies = viewModel.getSelectedMovie()
                populateMovie(movies)
            }
        }
    }

    private fun populateMovie(movieEntity: MovieEntity) {
        with(binding) {
            Glide.with(this@DetailMovieActivity)
                .load(movieEntity.movieImage)
                .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                .error(R.drawable.ic_error)
                .into(movieImage)
            val rating = movieEntity.movieRating
            movieName.text = movieEntity.movieName
            starRating(rating)
            movieRating.text = rating.toString()
            movieReleaseDate.text = movieEntity.movieReleaseDate
            movieTime.text = movieEntity.movieTime
            movieGenre.text = movieEntity.movieGenre
            movieOverview.text = movieEntity.movieOverview
            shareMovie.setOnClickListener {
                val intent = Intent()
                intent.action = Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, "Share Movie: ${movieEntity.movieName}")
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