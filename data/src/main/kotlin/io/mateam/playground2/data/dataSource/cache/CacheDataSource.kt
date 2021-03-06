package io.mateam.playground2.data.dataSource.cache

import io.mateam.playground2.data.utils.logDebug
import io.mateam.playground2.domain.entity.movie.PopularMovies

interface CacheDataSource {
    fun getPopularMovies(page: Int): PopularMovies?
    fun cachePopularMovies(movies: PopularMovies)
    fun clear()
}

class InMemoryCacheDataSource : CacheDataSource {

    private val cache = mutableMapOf<Int, PopularMovies>()

    override fun getPopularMovies(page: Int): PopularMovies? {
        val popularMovies = cache[page]
        logDebug("getPopularMovies page [$page]:  return movies size ${popularMovies?.movies?.size}")
        return popularMovies
    }

    override fun cachePopularMovies(movies: PopularMovies) {
        logDebug("addToCache: page [${movies.page}]:  return movies size ${movies.movies.size}")
        cache[movies.page] = movies
    }

    override fun clear() {
        logDebug("clear was called")
        cache.clear()
    }
}