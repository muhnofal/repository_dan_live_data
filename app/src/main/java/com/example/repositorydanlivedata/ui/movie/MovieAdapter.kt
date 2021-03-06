package com.example.repositorydanlivedata.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.repositorydanlivedata.R
import com.example.repositorydanlivedata.data.MovieEntity
import com.example.repositorydanlivedata.databinding.ItemsListBinding
import com.example.repositorydanlivedata.ui.detail.DetailMovieActivity
import com.example.repositorydanlivedata.ui.utils.ImageHelper.ENDPOINT
import com.example.repositorydanlivedata.ui.utils.ImageHelper.W185
import com.example.repositorydanlivedata.ui.utils.ImageHelper.getImageFromApi

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var listMovie = ArrayList<MovieEntity>()

    fun setMovie(movies: List<MovieEntity>) {
        this.listMovie.clear()
        this.listMovie.addAll(movies)
    }

    class MovieViewHolder(private val binding: ItemsListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private var movieRating: Double = 0.0
        private lateinit var moviePopular: String

        fun bind(movie: MovieEntity) {
            with(binding) {

                val link = movie.movieImage.let { movieImage ->
                    ENDPOINT + W185 + movieImage
                }
                getImageFromApi(
                    context = itemView.context,
                    loadingImage = R.drawable.ic_loading,
                    errorImage = R.drawable.ic_error,
                    imageLink = link,
                    movieImg
                )

                //texView adalah nama film
                textView.text = movie.movieName
                movieRating = movie.movieRating
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
                realeaseDate.text = movie.movieReleaseDate
                moviePopular = movie.moviePopularity.toString()
                popularity.text = moviePopular

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailMovieActivity::class.java)
                    intent.putExtra(DetailMovieActivity.EXTRA_ID, movie.movieId)
                    itemView.context.startActivity(intent)
                }

            }
        }

        private fun getOneStar() {
            binding.rating.visibility = View.VISIBLE
        }

        private fun getTwoStar() {
            binding.rating.visibility = View.VISIBLE
            binding.rating2.visibility = View.VISIBLE
        }

        private fun getThreeStar() {
            binding.rating.visibility = View.VISIBLE
            binding.rating2.visibility = View.VISIBLE
            binding.rating3.visibility = View.VISIBLE
        }

        private fun getFourStar() {
            binding.rating.visibility = View.VISIBLE
            binding.rating2.visibility = View.VISIBLE
            binding.rating3.visibility = View.VISIBLE
            binding.rating4.visibility = View.VISIBLE
        }

        private fun getFiveStar() {
            binding.rating.visibility = View.VISIBLE
            binding.rating2.visibility = View.VISIBLE
            binding.rating3.visibility = View.VISIBLE
            binding.rating4.visibility = View.VISIBLE
            binding.rating5.visibility = View.VISIBLE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemsListBinding: ItemsListBinding =
            ItemsListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(itemsListBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = listMovie[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int = listMovie.size

}