package com.example.architecturecomponent.ui.movie

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.architecturecomponent.databinding.FragmentMovieBinding

class MovieFragment : Fragment() {

    private lateinit var fragmentMovieBinding: FragmentMovieBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        fragmentMovieBinding = FragmentMovieBinding.inflate(layoutInflater, container, false)
        return fragmentMovieBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (activity != null) {

            val viewModel = ViewModelProvider(
                this,
                ViewModelProvider.NewInstanceFactory()
            )[MovieViewModel::class.java]

            val movies = viewModel.getMovies()
            val movieAdapter = MovieAdapter()
            movieAdapter.setMovie(movies)
            with(fragmentMovieBinding.movieRecycler) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                val dividerItemDecoration =
                    DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL)
//                dividerItemDecoration.setDrawable(R.drawable.)
                addItemDecoration(dividerItemDecoration)
                adapter = movieAdapter
            }
        }
    }
}