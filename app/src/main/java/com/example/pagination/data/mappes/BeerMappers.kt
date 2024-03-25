package com.example.pagination.data.mappes

import com.example.pagination.data.local.BeerEntity
import com.example.pagination.data.remote.BeerDto
import com.example.pagination.domain.Beer

fun BeerDto.toBeerEntity(): BeerEntity {
    return BeerEntity(
        id = this.id,
        name =this. name,
        tagline = this.tagline,
        description = this.description,
        firstBrewed = this.firstBrewed,
        imageUrl = this.imageUrl,
    )
}

fun BeerEntity.toBeer(): Beer {
    return Beer(
        id = this.id,
        name = this.name,
        tagline = this.tagline,
        description = this.description,
        firstBrewed = this.firstBrewed,
        imageUrl = this.imageUrl,
    )
}