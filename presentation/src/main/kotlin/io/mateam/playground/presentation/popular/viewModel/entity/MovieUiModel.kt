package io.mateam.playground.presentation.popular.viewModel.entity

data class MovieUiModel(
    val id: Int,
    val imageUrl: String,
    val voteAverage: Double,
    val title: String,
    val adult: Boolean,
    val releaseData: String,
    val originalLanguage: String,
    val overview:String
)