package com.example.architecturecomponent.ui.tvshow

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.architecturecomponent.R
import com.example.architecturecomponent.data.TvShowEntity
import com.example.architecturecomponent.databinding.ItemsListBinding
import com.example.architecturecomponent.ui.detail.DetailTvShowActivity

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>() {

    private var listTvShow = ArrayList<TvShowEntity>()

    fun setTvShow(tvShow: List<TvShowEntity>) {
        this.listTvShow.clear()
        this.listTvShow.addAll(tvShow)
    }

    class TvShowViewHolder(private val binding: ItemsListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private var movieRating: Double = 0.0

        fun bind(tvShow: TvShowEntity) {
            with(binding) {

                Glide.with(itemView.context)
                    .load(tvShow.tvImage)
                    .apply(RequestOptions.placeholderOf(R.drawable.ic_loading))
                    .error(R.drawable.ic_error)
                    .into(movieImg)
                //texView adalah nama film
                textView.text = tvShow.tvName
                movieRating = tvShow.tvRating
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
                realeaseDate.text = tvShow.tvReleaseDate
                time.text = tvShow.tvTime

                itemView.setOnClickListener {
                    val intent = Intent(itemView.context, DetailTvShowActivity::class.java)
                    intent.putExtra(DetailTvShowActivity.EXTRA_ID, tvShow.tvId)
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val itemsListBinding: ItemsListBinding =
            ItemsListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TvShowViewHolder(itemsListBinding)
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
        val tvShow = listTvShow[position]
        holder.bind(tvShow)
    }

    override fun getItemCount(): Int = listTvShow.size
}