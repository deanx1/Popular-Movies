package com.androidcourse.myapplication.api

class MovieRepository {
    private val movieApi: MovieApiService = MovieApi.createApi()

    fun getMovies(year: String) = movieApi.getMovies(year)
}