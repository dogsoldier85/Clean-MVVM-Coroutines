package io.mateam.playground2.data.dataSource.remote.entity

data class TmdbPopularMoviesResponse(
    val page: Int?,
    val results: List<TmdbMovie>?,
    val total_results: Int?,
    val total_pages: Int?
)