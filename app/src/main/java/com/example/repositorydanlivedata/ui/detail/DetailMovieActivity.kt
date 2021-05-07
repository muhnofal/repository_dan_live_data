package com.example.repositorydanlivedata.ui.detail

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.repositorydanlivedata.R
import com.example.repositorydanlivedata.data.MovieDetailEntity
import com.example.repositorydanlivedata.databinding.ActivityDetailMovieBinding
import com.example.repositorydanlivedata.ui.utils.ImageHelper.ENDPOINT
import com.example.repositorydanlivedata.ui.utils.ImageHelper.W500
import com.example.repositorydanlivedata.ui.utils.ImageHelper.getImageFromApi
import com.example.repositorydanlivedata.viewmodel.ViewModelFactory

class DetailMovieActivity : AppCompatActivity() {


    private lateinit var binding: ActivityDetailMovieBinding


    companion object {
        const val EXTRA_ID = "extra_id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()

        binding = ActivityDetailMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailFilmViewModel::class.java]

        val extras = intent.extras

        if (extras != null) {

            val movieId = extras.getInt(EXTRA_ID)

            viewModel.setSelectedMovie(movieId)
            viewModel.getMovie().observe(this, { movies -> populateMovie(movies) })
        }


    }

    private fun populateMovie(movieEntity: MovieDetailEntity) {
        val popularity: String
        val link = movieEntity.movieBackDrop.let { movieImg -> ENDPOINT + W500 + movieImg }
        with(binding) {

            getImageFromApi(
                context = this@DetailMovieActivity,
                loadingImage = R.drawable.ic_loading,
                errorImage = R.drawable.ic_error,
                imageLink = link,
                imageView = movieImage
            )

            val rating = movieEntity.movieRating
            movieName.text = movieEntity.movieName
            starRating(rating)
            movieRating.text = rating.toString()
            movieReleaseDate.text = movieEntity.movieReleaseDate
            popularity = movieEntity.moviePopularity.toString()
            moviePopularity.text = popularity
            movieOverview.text = movieEntity.movieOverview
            movieGenre.text = movieEntity.movieGenre
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