package io.mateam.playground.presentation.popular.viewModel.mapper

import io.mateam.playground.presentation.popular.viewModel.entity.MovieUiModel
import io.mateam.playground2.domain.entity.Movie

class PopularMoviesUiMapper {
    fun map(movies: List<Movie>): List<MovieUiModel> {
        return movies.map { movie ->
            MovieUiModel(
                id = movie.id,
                imageUrl = movie.posterPath,
                voteAverage = movie.voteAverage,
                title = movie.title,
                adult = movie.adult
            )
        }
    }
}