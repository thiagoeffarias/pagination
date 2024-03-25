package com.example.pagination.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import javax.inject.Named

@Entity
data class BeerEntity(
    @PrimaryKey
    val id: Int,
    val name: String,
    val tagline: String,
    val description: String,
    @Named("first_brewed")
    val firstBrewed: String,
    @Named("image_url")
    val imageUrl: String?
)

