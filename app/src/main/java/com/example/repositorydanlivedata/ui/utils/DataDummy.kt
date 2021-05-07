package com.example.repositorydanlivedata.ui.utils

import com.example.repositorydanlivedata.data.MovieDetailEntity
import com.example.repositorydanlivedata.data.MovieEntity
import com.example.repositorydanlivedata.data.TvShowDetailEntity
import com.example.repositorydanlivedata.data.TvShowEntity
import com.example.repositorydanlivedata.data.source.remote.response.MovieGenre
import com.example.repositorydanlivedata.data.source.remote.response.MovieResponse
import com.example.repositorydanlivedata.data.source.remote.response.TvShowGenre
import com.example.repositorydanlivedata.data.source.remote.response.TvShowResponse

object DataDummy {

    fun generateDummyMovie(): List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        movies.add(
            MovieEntity(
                1,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        movies.add(
            MovieEntity(
                2,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        movies.add(
            MovieEntity(
                3,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        movies.add(
            MovieEntity(
                4,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        movies.add(
            MovieEntity(
                5,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        movies.add(
            MovieEntity(
                6,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        movies.add(
            MovieEntity(
                7,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        movies.add(
            MovieEntity(
                8,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        movies.add(
            MovieEntity(
                9,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        movies.add(
            MovieEntity(
                10,
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg"
            )
        )

        return movies
    }

    fun generateDummyMovieDetail(): List<MovieDetailEntity> {
        val movie = ArrayList<MovieDetailEntity>()
        movie.add(
            MovieDetailEntity(
                1,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                7.8,
                "2021-04-07",
                4614.697,
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "Fantasy, Action, Adventure, Science Fiction, Thriller"
            )
        )
        return movie
    }

    fun generateRemoteDummyMovies(): List<MovieResponse> {
        val movies = ArrayList<MovieResponse>()

        movies.add(
            MovieResponse(
                1,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            MovieResponse(
                2,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            MovieResponse(
                3,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            MovieResponse(
                4,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            MovieResponse(
                5,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            MovieResponse(
                6,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            MovieResponse(
                7,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            MovieResponse(
                8,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            MovieResponse(
                9,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            MovieResponse(
                10,
                "Mortal Kombat",
                "Washed-up MMA fighter Cole Young, unaware of his heritage, and hunted by Emperor Shang Tsung's best warrior, Sub-Zero, seeks out and trains with Earth's greatest champions as he prepares to stand against the enemies of Outworld in a high stakes battle for the universe.",
                "https://image.tmdb.org/t/p/w185/xGuOF1T3WmPsAcQEQJfnG7Ud9f8.jpg",
                "https://image.tmdb.org/t/p/w500/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                7.8,
                "2021-04-07",
                listOf(MovieGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )
        return movies
    }

    fun generateDummyTvShowDetail(): List<TvShowDetailEntity> {
        val movie = ArrayList<TvShowDetailEntity>()
        movie.add(
            TvShowDetailEntity(
                1,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                "Fantasy, Action, Adventure, Science Fiction, Thriller"
            )
        )
        return movie
    }

    fun generateDummyTvShow(): List<TvShowEntity> {
        val tvShows = ArrayList<TvShowEntity>()

        tvShows.add(
            TvShowEntity(
                1,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        tvShows.add(
            TvShowEntity(
                2,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        tvShows.add(
            TvShowEntity(
                3,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        tvShows.add(
            TvShowEntity(
                4,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        tvShows.add(
            TvShowEntity(
                5,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        tvShows.add(
            TvShowEntity(
                6,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        tvShows.add(
            TvShowEntity(
                7,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        tvShows.add(
            TvShowEntity(
                8,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        tvShows.add(
            TvShowEntity(
                9,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        tvShows.add(
            TvShowEntity(
                10,
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                7.9,
                "2021-03-19",
                2008.626,
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
            )
        )

        return tvShows
    }

    fun generateRemoteDummyTvShows(): List<TvShowResponse> {
        val movies = ArrayList<TvShowResponse>()

        movies.add(
            TvShowResponse(
                2,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            TvShowResponse(
                3,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            TvShowResponse(
                4,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            TvShowResponse(
                5,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            TvShowResponse(
                6,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            TvShowResponse(
                7,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            TvShowResponse(
                8,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            TvShowResponse(
                9,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            TvShowResponse(
                10,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )

        movies.add(
            TvShowResponse(
                1,
                "The Falcon and the Winter Soldier",
                "Following the events of “Avengers: Endgame”, the Falcon, Sam Wilson and the Winter Soldier, Bucky Barnes team up in a global adventure that tests their abilities, and their patience.",
                "https://image.tmdb.org/t/p/w185/6kbAMLteGO8yyewYau6bJ683sw7.jpg",
                "https://image.tmdb.org/t/p/w500/b0WmHGc8LHTdGCVzxRb3IBMur57.jpg",
                7.9,
                "2021-03-19",
                listOf(TvShowGenre("Fantasy, Action, Adventure, Science Fiction, Thriller")),
                4614.697,
            )
        )
        return movies
    }

}