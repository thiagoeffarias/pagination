package com.example.pagination.data.remote

import javax.inject.Named

data class BeerDto(
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    @Named("first_brewed")
    val firstBrewed: String,
    @Named("image_url")
    val imageUrl: String?
)