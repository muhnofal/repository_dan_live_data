package com.example.architecturecomponent.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import com.example.architecturecomponent.R
import com.example.architecturecomponent.ui.utils.DataDummy
import org.junit.Rule
import org.junit.Test

class HomeActivityTest {

    private val dummyMovie = DataDummy.generateDummyMovie()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    @get:Rule
    var activityRule = ActivityScenarioRule(HomeActivity::class.java)

    @Test
    fun loadMovie() {
        onView(withId(R.id.movie_recycler)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_recycler)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }

    @Test
    fun loadDetailMovie() {
        onView(withId(R.id.movie_recycler)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.movieName)).check(matches(isDisplayed()))
        onView(withId(R.id.movieName)).check(matches(withText(dummyMovie[0].movieName)))

        onView(withId(R.id.movieImage)).check(matches(isDisplayed()))

        onView(withId(R.id.movieRating)).check(matches(isDisplayed()))
        onView(withId(R.id.movieRating)).check(matches(withText(dummyMovie[0].movieRating.toString())))

        onView(withId(R.id.movieReleaseDate)).check(matches(isDisplayed()))
        onView(withId(R.id.movieReleaseDate)).check(matches(withText(dummyMovie[0].movieReleaseDate)))

        onView(withId(R.id.movieTime)).check(matches(isDisplayed()))
        onView(withId(R.id.movieTime)).check(matches(withText(dummyMovie[0].movieTime)))

        onView(withId(R.id.movieGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.movieGenre)).check(matches(withText(dummyMovie[0].movieGenre)))

        onView(withId(R.id.movieOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.movieOverview)).check(matches(withText(dummyMovie[0].movieOverview)))
    }

    @Test
    fun loadTvShow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.tvShow_recycler)).check(matches(isDisplayed()))
        onView(withId(R.id.tvShow_recycler)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyMovie.size
            )
        )
    }

    @Test
    fun loadDetailTvShow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.tvShow_recycler)).perform(
            RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(
                0,
                click()
            )
        )
        onView(withId(R.id.tvName)).check(matches(isDisplayed()))
        onView(withId(R.id.tvName)).check(matches(withText(dummyTvShow[0].tvName)))

        onView(withId(R.id.tvImage)).check(matches(isDisplayed()))

        onView(withId(R.id.tvRating)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRating)).check(matches(withText(dummyTvShow[0].tvRating.toString())))

        onView(withId(R.id.tvReleaseDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvReleaseDate)).check(matches(withText(dummyTvShow[0].tvReleaseDate)))

        onView(withId(R.id.tvTime)).check(matches(isDisplayed()))
        onView(withId(R.id.tvTime)).check(matches(withText(dummyTvShow[0].tvTime)))

        onView(withId(R.id.tvGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.tvGenre)).check(matches(withText(dummyTvShow[0].tvGenre)))

        onView(withId(R.id.tvOverview)).check(matches(isDisplayed()))
        onView(withId(R.id.tvOverview)).check(matches(withText(dummyTvShow[0].tvOverview)))
    }

}