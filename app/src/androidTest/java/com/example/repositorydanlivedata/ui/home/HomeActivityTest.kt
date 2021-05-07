package com.example.repositorydanlivedata.ui.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.IdlingRegistry
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.repositorydanlivedata.R
import com.example.repositorydanlivedata.ui.utils.DataDummy
import com.example.repositorydanlivedata.ui.utils.EspressoIdlingResource
import org.junit.After
import org.junit.Before
import org.junit.Test


class HomeActivityTest {

    private val dummyMovie = DataDummy.generateDummyMovie()
    private val dummyTvShow = DataDummy.generateDummyTvShow()

    @Before
    fun setUp() {
        ActivityScenario.launch(HomeActivity::class.java)
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResouce)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResouce)
    }

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
        onView(withId(R.id.movieImage)).check(matches(isDisplayed()))
        onView(withId(R.id.movieRating)).check(matches(isDisplayed()))
        onView(withId(R.id.movieReleaseDate)).check(matches(isDisplayed()))
        onView(withId(R.id.moviePopularity)).check(matches(isDisplayed()))
        onView(withId(R.id.movieGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.movieOverview)).check(matches(isDisplayed()))
    }

    @Test
    fun loadTvShow() {
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.tvShow_recycler)).check(matches(isDisplayed()))
        onView(withId(R.id.tvShow_recycler)).perform(
            RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(
                dummyTvShow.size
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
        onView(withId(R.id.tvImage)).check(matches(isDisplayed()))
        onView(withId(R.id.tvRating)).check(matches(isDisplayed()))
        onView(withId(R.id.tvReleaseDate)).check(matches(isDisplayed()))
        onView(withId(R.id.tvPopular)).check(matches(isDisplayed()))
        onView(withId(R.id.tvGenre)).check(matches(isDisplayed()))
        onView(withId(R.id.tvOverview)).check(matches(isDisplayed()))
    }

}